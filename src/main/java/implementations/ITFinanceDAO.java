package implementations;

/**
 * Created by Pouya on 4/5/2015.
 */


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import repositories.ITFinanceRepository;
import resources.ITFinance;



public class ITFinanceDAO implements ITFinanceRepository {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public ITFinance findByAccountHolderID(String accountHolderID) {
        return null;
    }

    @Override
    public void save(ITFinance p) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(p);
        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<ITFinance> list() {
        Session session = this.sessionFactory.openSession();
        List<ITFinance> personList = session.createQuery("from Person").list();
        session.close();
        return personList;
    }

}