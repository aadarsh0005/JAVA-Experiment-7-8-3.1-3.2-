import org.springframework.context.annotation.*; public class MainApp{
public static void main(String[] args){AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
Student s=ctx.getBean(Student.class); s.display(); ctx.close();}}