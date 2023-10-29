import java.util.Scanner;

class pro67{
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.println("enter m1\n");
float m1=sc.nextFloat();
System.out.println("enter m2\n");
float m2=sc.nextFloat();
System.out.println("enter m3\n");
float m3=sc.nextFloat();
System.out.println("enter m4\n");
float m4=sc.nextFloat();
System.out.println("enter m5\n");
float m5=sc.nextFloat();
float sum =m1+m2+m3+m4+m5;
float perc=sum/500*100;
System.out.println(perc);
if(perc<100 && perc>80){
    System.out.println("Grade A");
}
else if(perc<80 && perc>60){
    System.out.println("Grade B");
}
else if(perc<60 && perc>40){
    System.out.println("Grade C");
}
else if(perc<40 && perc >33){
    System.out.println("Grade D");
}
else{
    System.out.println("Fail");
}
   
   
   
   
    }
}
