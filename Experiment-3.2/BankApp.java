import org.springframework.context.annotation.*;
public class BankApp{ public static void main(String[] args){
AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
BankService bs=ctx.getBean(BankService.class); bs.transfer(101,102,500); ctx.close();}}