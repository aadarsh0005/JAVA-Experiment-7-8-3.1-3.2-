import org.hibernate.*; import org.springframework.stereotype.Repository;
@Repository public class BankDAO{ public Account get(Session ses,int acc){return ses.get(Account.class,acc);}
public void update(Session ses,Account a){ses.update(a);} }