import java.util.Scanner;

public class conditional {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.println("enter the numbers");
    int a = s.nextInt();
    int b = s.nextInt();

    System.out.println("enter the operation from the following");
    System.out.println("ADD  SUB  MUL  DIV");
    String op =s.next();

    if (op.equals("ADD")) {
      System.out.println(op);
      System.out.println(a + b);
    } else if (op.equals("SUB")) {
      System.out.println(a - b);
    } else if (op.equals("MUL")) {
      System.out.println(a * b);
    } else if (op.equals("DIV")) {
      System.out.println(a / b);
    }else{
      System.out.println("invalid entry");
    }
  }
}
