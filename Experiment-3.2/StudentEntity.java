import jakarta.persistence.*; @Entity @Table(name="student")
public class StudentEntity{
@Id private int id; private String name; private double marks;
public StudentEntity(){} public StudentEntity(int id,String name,double marks){this.id=id;this.name=name;this.marks=marks;}
public int getId(){return id;} public String getName(){return name;} public double getMarks(){return marks;}
public void setName(String n){name=n;} public void setMarks(double m){marks=m;}}