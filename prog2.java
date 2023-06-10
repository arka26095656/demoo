import java.util.Scanner;
class Student
{
String name;
int m1,m2,m3;
void initialize(String n, int a,int b,int c)
{name=n;
m1=a;
m2=b;
m3=c;
}
double average()
{
double avg;
avg=(m1+m2+m3)/3;
return avg;
}
void display()
{
System.out.println("the name of the student is: "+name);
System.out.println("the total marks of the student is: "+ (m1+m2+m3));
}
}
class Info{
public static void main(String args[]){
Student ob=new Student();
Scanner sc=new Scanner(System.in);
String n;
int a,b,c;
System.out.println("enter name and marks of three subjects");
n=sc.nextLine();
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
ob.initialize(n,a,b,c);
System.out.println("the average is :"+ ob.average());
ob.display();
}}

