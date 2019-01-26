package annotationlearing.zhangll.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import annotationlearing.zhangll.transaction.dao.AcountDao;
import annotationlearing.zhangll.transaction.pojo.Person;

@Service("accountService")
public class AccountServiceImp implements AccountService {
    @Autowired
    private AcountDao acountDao;

    @Transactional
    @Override
    public void transfer(Person payer, Person payee, int money) {
        acountDao.out(payer);
        acountDao.in(payee);
        int DA = 1 / 0;
    }
}