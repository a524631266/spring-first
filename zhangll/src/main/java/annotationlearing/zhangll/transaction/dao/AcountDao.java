package annotationlearing.zhangll.transaction.dao;

import annotationlearing.zhangll.transaction.pojo.Person;

public interface AcountDao {
    /**
     * 汇款
     * 
     * @param person
     */
    public void out(Person person);

    /**
     * 收款
     * 
     * @param person
     */
    public void in(Person person);
}