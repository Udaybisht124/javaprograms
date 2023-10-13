import java.util.Scanner;

 class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the prism:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the prism:");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the prism:");
        double height = scanner.nextDouble();

        double area = length * width;
        double volume = area * height;

        System.out.println("The area of the prism is: " + area);
        System.out.println("The volume of the prism is: " + volume);
    }
}