import java.util.Scanner;

 class a {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Edge Of Cube");
        float edge = scanner.nextFloat();
        float surfacearea=6*edge*edge;
        System.out.println("The surface area of cube is"+surfacearea);
}}