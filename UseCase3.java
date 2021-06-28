public class UseCase3

{


public static void main(String[] args) 


{

int parttime=1;
int fulltime=2;

int emprateperhour=20;


int emphrs=0;

int empwage=0;


double empCheck= Math.floor(Math.random()*10)%3;


if(empCheck == parttime)

emphrs=4;

else if(empCheck == fulltime)

emphrs=8;

else
emphrs=0;


empwage= emphrs*emprateperhour;

System.out.println("Emp Wage: " +empwage);



}


}
