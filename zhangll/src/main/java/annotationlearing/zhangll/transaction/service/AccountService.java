package annotationlearing.zhangll.transaction.service;

import annotationlearing.zhangll.transaction.pojo.Person;

public interface AccountService {
    /**
     * 转账事务
     */
    public void transfer(Person payer, Person payee, int money);
}