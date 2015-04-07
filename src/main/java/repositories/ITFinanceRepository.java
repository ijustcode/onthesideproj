package repositories;

import resources.ITFinance;
import java.util.List;



public interface ITFinanceRepository {

    public ITFinance findByAccountHolderID (String accountHolderID);
    public void save(ITFinance itFinance);

    public List<ITFinance> list();


//    public User findByFirstName(String firstName);
//    public List<User> findByLastName(String lastName);

}

