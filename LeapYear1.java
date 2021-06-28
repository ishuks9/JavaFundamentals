import java.util.Scanner; 

public class LeapYear1
 
{

 public static void main(String args[])
 
{

 Scanner sc =new Scanner(System.in);
 
System.out.println("Enter the number of day: "); 

int number= sc.nextInt(); 



 switch(number){
    case1:
         System.out.println("Mon");
     break;
case2:
         System.out.println("Tue");
     break;
case3:
         System.out.println("Wed");
     break;
case4:
         System.out.println("Thu");
     break;
case5:
         System.out.println("fri");
     break;
default:
         System.out.println("Incorrect day number");
    
}
}


}