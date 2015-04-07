package costnomics;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.ITFinanceRepository;
import resources.ITFinance;

import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Component
@RequestMapping("api/v1/users")
@RestController
public class HelloService {

    private final AtomicLong account_counter = new AtomicLong();

    @Autowired
    private ITFinanceRepository itFinanceRepository;


    public String sayHello() {
        return "Hello world!";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ITFinance createFinanceAccount (@Valid @RequestBody ITFinance itFinanceAccount) {
        itFinanceAccount.setAccountHolderID("a-" + account_counter.incrementAndGet());

        return itFinanceAccount;
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public User getUser(@PathVariable String id) {
//        return users.findByUserid(id);
//    }

}