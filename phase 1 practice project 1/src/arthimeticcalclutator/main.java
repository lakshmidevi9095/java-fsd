package arthimeticcalclutator;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char n;
	    Double number1, number2, result;

	    Scanner input = new Scanner(System.in);

	    System.out.println("select an operator: +, -, *, or /: ");
	    n = input.next().charAt(0);
	    		
	    System.out.println("Enter first number : ");
	    number1 = input.nextDouble();

	    System.out.println("Enter second number : ");
	    number2 = input.nextDouble();

	    switch (n) 
	    {

	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	   }
}

	


