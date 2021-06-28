public class UseCase2
{

public static void main(String[] args) 

{

int fulltime=1;
int emprateperhour=20;

int emphrs=0;
int empwage=0;

double empCheck= Math.floor(Math.random()*10)%2;

if(empCheck == fulltime)
emphrs=8;

else
emphrs=0;

empwage= emphrs*emprateperhour;
System.out.println("Emp Wage: " +empwage);

}

}
