import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        int largestNumber=0;
        if (num2 > largestNumber) {
            largestNumber = num2;
        }

        if (num3 > largestNumber) {
            largestNumber = num3;
        }

        double sumOfLargest = largestNumber;
        double avg=(num1+num2+num3)/3;
        System.out.println("The sum of the largest number is: " + sumOfLargest);

        System.out.println("Average of the three sum is : "+avg);
        sc.close();
    }
}

