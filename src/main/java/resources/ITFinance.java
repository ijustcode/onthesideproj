package resources;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITFinance")
public class ITFinance {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String accountHolderID;


    private String accountHolderEmail;
    private String balance;
    private String dueDate;


    public ITFinance(String user_id, String accountHolderEmail, String balance, String dueDate) {
        this.accountHolderID = user_id;
        this.accountHolderEmail = accountHolderEmail;
        this.balance = balance;
        this.dueDate = dueDate;
    }

    public ITFinance () {
    }

    public String getUser_id() { return accountHolderID; }

    public String getAccountHolderEmail() {
        return accountHolderEmail;
    }

    public String getBalance() { return balance;}

    public String getDueDate() { return dueDate;}

    public void  setAccountHolderID (String accountHolderID) {
        this.accountHolderID = accountHolderID;
    }

    public void setAccountHolderEmail(String accountHolderEmail) {
        this.accountHolderEmail = accountHolderEmail;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }


    /*      end of setters and getters     */

}