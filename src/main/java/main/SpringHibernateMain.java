package main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.ITFinanceRepository;
import resources.ITFinance;

/**
 * Created by Pouya on 4/6/2015.
 */
public class SpringHibernateMain {

    public static void main (String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ITFinanceRepository itFinanceRepository = context.getBean(ITFinanceRepository.class);

        ITFinance finance = new ITFinance();
        finance.setAccountHolderID("1001");
        finance.setBalance("500");

        itFinanceRepository.save(finance);

        System.out.println("Person::"+finance);

        List<ITFinance> list = itFinanceRepository.list();

        for(ITFinance p : list){
            System.out.println("Person List::"+p);
        }
        //close resources
        context.close();
    }
}
