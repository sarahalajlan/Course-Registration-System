import java.util.Scanner;
public class Customer
{
//Sarah Al Ajlan 442202314
private int id ;
private String name ;
private String jobTitle ;
public Customer()
{
id = 0 ;
name = "" ;
jobTitle = "" ;
}
public Customer(int id2 , String Name2 , String jobTitle2 )
{
id = id2 ;
name = Name2 ;
jobTitle = jobTitle2 ;
}
public String getjobTitle ()
{
return jobTitle ;
}
public boolean isequalJopTitle(String title)
{
if( jobTitle.equals( title ) )
return true;
else
return false;
}
public void getDescription()
{
System.out.println("ID: " + id) ;
System.out.println("Name: " + name) ;
System.out.println("jobTitle: " + jobTitle) ;
}
}


class Bank
{
public static void main (String [] args)
{
Scanner input = new Scanner (System.in);
Customer obj1 = new Customer(44345 , "Ali" , "Lawyer" );
System.out.println("enter ID: ");
int id = input.nextInt();
System.out.println("enter Name: ");
String name = input.next();
System.out.println("enter Job Title: ");
String jobTitle = input.next();
Customer obj2 = new Customer(id , name , jobTitle );
if( obj1.isequalJopTitle( obj2.getjobTitle() ) )
System.out.println("Tow Job titles have the same value");
else
System.out.println("Tow Job titles have Different value");
}
}