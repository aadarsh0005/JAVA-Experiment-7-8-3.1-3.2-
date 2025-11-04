import jakarta.persistence.*; @Entity @Table(name="account")
public class Account{ @Id int accNo; double balance;
public Account(){} public Account(int accNo,double balance){this.accNo=accNo;this.balance=balance;}
public int getAccNo(){return accNo;} public double getBalance(){return balance;} public void setBalance(double b){balance=b;}}