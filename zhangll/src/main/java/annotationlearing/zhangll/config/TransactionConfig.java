package annotationlearing.zhangll.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import annotationlearing.zhangll.transaction.service.AccountService;
import annotationlearing.zhangll.transaction.service.AccountServiceImp;

// @PropertySource(value = { "classpath:/config/mysql.properties" })
@EnableTransactionManagement
@Configuration
@ComponentScan(value = { "annotationlearing.zhangll.transaction" })
public class TransactionConfig {
    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource cp = new ComboPooledDataSource();
        cp.setUser("root");
        cp.setPassword("root");
        cp.setDriverClass("com.mysql.jdbc.Driver");
        cp.setJdbcUrl("jdbc:mysql://localhost:3306/blog");
        return cp;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
        JdbcTemplate jdt = new JdbcTemplate(dataSource());
        return jdt;
    }

    @Bean
    public PlatformTransactionManager transationManager() throws PropertyVetoException {
        return new DataSourceTransactionManager(dataSource());
    }
}