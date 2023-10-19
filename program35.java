import java.util.Scanner;

 class pro35{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
float pi= 3.14f;
        System.out.println("Enter the radius of the Cylinder:");
        float radius = scanner.nextFloat();

        System.out.println("Enter the height of the Cylinder:");
    float height = scanner.nextFloat();

    
float volumeofcylinder = pi*radius*radius*height;

System.out.println("The volume of the Cylinder is: " + volumeofcylinder);
    }
}