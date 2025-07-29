import java.util.Scanner; 

public class Calculator{
    public static double add(double a, double b){
        return a + b; 
    }
    public static double subtract(double a, double b){
        return a - b; 
    }
    public static double multiply(double a, double b){
        return a * b; 
    }
    public static double divide(double a, double b){
        if (b == 0) {
            System.out.println("Error: Division by zero error!!"); 
            return 0; 
        }
        return a / b; 
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 
        System.out.println("Enter 1st number: "); 

        double n1 = input.nextDouble(); 

        System.out.println("Enter 2nd number: "); 
        double n2 = input.nextDouble(); 
        
        System.out.println("Enter operator (+, -, *, /): "); 
        char operator = input.next().charAt(0); 
        double res; 
        switch(operator){
            case '+': 
                res = add(n1, n2); 
                break; 
            case '-':
                res = subtract(n1, n2); 
                break; 
            case '*': 
                res = multiply(n1, n2); 
                break; 
            case '/': 
                res = divide(n1, n2); 
                break; 
            default: 
                System.out.println("Invalid operator"); 
                return; 
        }

        System.out.println("Result: " + res); 
        input.close(); 
    }
}