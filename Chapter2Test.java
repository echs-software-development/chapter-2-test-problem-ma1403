import java.util.Scanner;

public class Chapter2Test {
  public static void main(String[] args) {
  Scanner scan= new Scanner(System.in);
  System.out.println("Please enter first number: ");
  int num1=scan.nextInt();
  System.out.println("Please enter second number: ");
  int num2=scan.nextInt();
  double answer=(double)(num1+num2)/2;
  System.out.println("The average is "+ answer);

  }
}