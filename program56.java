import java.util.Scanner;
class pro56{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Year");
    int year =sc.nextInt();
  if((year % 400 == 0) ||(year % 100 != 0) && (year % 4 == 0)){
    System.out.println("leap year");
  }
  else{
    System.out.println("Not a Leap Year");
  }

}
    
    }
