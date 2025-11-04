import org.hibernate.*; import org.hibernate.cfg.Configuration;
public class HibernateUtil{private static SessionFactory sf=new Configuration().configure().buildSessionFactory();
public static SessionFactory getSessionFactory(){return sf;}}