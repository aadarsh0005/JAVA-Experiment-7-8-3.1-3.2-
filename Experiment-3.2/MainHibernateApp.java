public class MainHibernateApp{
public static void main(String[] args){StudentDAO dao=new StudentDAO();
dao.add(new StudentEntity(1,"Kunal",85)); dao.add(new StudentEntity(2,"Riya",91));
for(StudentEntity s:dao.getAll()){System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());}
dao.update(1,95); dao.delete(2);}}