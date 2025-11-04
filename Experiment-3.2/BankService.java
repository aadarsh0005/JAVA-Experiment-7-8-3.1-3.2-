import org.hibernate.*; import org.springframework.beans.factory.annotation.*; import org.springframework.stereotype.Service; import org.springframework.transaction.annotation.Transactional;
@Service public class BankService{
@Autowired private BankDAO dao; @Autowired private SessionFactory sf;
@Transactional public void transfer(int from,int to,double amt){
Session ses=sf.getCurrentSession(); Account a1=dao.get(ses,from); Account a2=dao.get(ses,to);
a1.setBalance(a1.getBalance()-amt); a2.setBalance(a2.getBalance()+amt);
dao.update(ses,a1); dao.update(ses,a2);} }