import org.hibernate.*; import java.util.*;
public class StudentDAO{
public void add(StudentEntity s){Session ses=HibernateUtil.getSessionFactory().openSession();Transaction tx=ses.beginTransaction();
ses.save(s);tx.commit();ses.close();}
public List<StudentEntity> getAll(){Session ses=HibernateUtil.getSessionFactory().openSession();
List<StudentEntity> list=ses.createQuery("from StudentEntity").list();ses.close();return list;}
public void update(int id,double marks){Session ses=HibernateUtil.getSessionFactory().openSession();Transaction tx=ses.beginTransaction();
StudentEntity s=ses.get(StudentEntity.class,id);s.setMarks(marks);tx.commit();ses.close();}
public void delete(int id){Session ses=HibernateUtil.getSessionFactory().openSession();Transaction tx=ses.beginTransaction();
StudentEntity s=ses.get(StudentEntity.class,id);ses.delete(s);tx.commit();ses.close();}}