package annotationlearing.zhangll.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
// 必须导入jdbc-starter
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import annotationlearing.zhangll.transaction.pojo.Person;

@Repository
public class AcountDaoImpl implements AcountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void out(Person person) {
        jdbcTemplate.update("update account set money = money - ? where username = ?", person.getMoney(),
                person.getUsername());
    }

    @Override
    public void in(Person person) {
        jdbcTemplate.update("update account set money = money + ? where username = ?", person.getMoney(),
                person.getUsername());
    }

}