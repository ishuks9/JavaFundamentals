public class EmpwageUC5

{

public static final int parttime=1;
public static final int fulltime=2;
public static final int emprateperhour=20;
public static final int noofworkingdays=2;

public static void main(String[] args) 


{


int emphrs=0;

int empwage=0;

int totalempwage=0;

for(int day=0;day<noofworkingdays;day++){

int empCheck=(int) Math.floor(Math.random()*10)%3;


switch(empCheck)
{
case parttime:
emphrs=4;
break;
case fulltime:
emphrs=8;
break;
default:
emphrs=0;
}
empwage= emphrs*emprateperhour;
totalempwage += empwage;
System.out.println("Emp Wage: " +empwage);
}
System.out.println("Total Emp Wage: " +totalempwage);

}
}
