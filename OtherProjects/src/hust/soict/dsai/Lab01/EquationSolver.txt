import java.util.Scanner;

public class EquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of equation to solve:");
        System.out.println("1. First-degree equation with one variable (ax + b = 0)");
        System.out.println("2. System of two first-degree equations with two variables");
        System.out.println("3. Second-degree equation (quadratic) with one variable (ax^2 + bx + c = 0)");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                solveLinearEquation(scanner);
                break;
            case 2:
                solveSystemOfLinearEquations(scanner);
                break;
            case 3:
                solveQuadraticEquation(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // Solve ax + b = 0
    public static void solveLinearEquation(Scanner scanner) {
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter constant b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinite solutions.");
            } else {
                System.out.println("The equation has no solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("The solution is x = " + x);
        }
    }

    // Solve the system of two equations:
    // a1x + b1y = c1
    // a2x + b2y = c2
    public static void solveSystemOfLinearEquations(Scanner scanner) {
        System.out.print("Enter coefficient a1: ");
        double a1 = scanner.nextDouble();
        System.out.print("Enter coefficient b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter constant c1: ");
        double c1 = scanner.nextDouble();
        
        System.out.print("Enter coefficient a2: ");
        double a2 = scanner.nextDouble();
        System.out.print("Enter coefficient b2: ");
        double b2 = scanner.nextDouble();
        System.out.print("Enter constant c2: ");
        double c2 = scanner.nextDouble();

        double determinant = a1 * b2 - a2 * b1;
        
        if (determinant == 0) {
            if (a1 * c2 == a2 * c1 && b1 * c2 == b2 * c1) {
                System.out.println("The system has infinite solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x = (c1 * b2 - c2 * b1) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            System.out.println("The solution is x = " + x + ", y = " + y);
        }
    }

    // Solve ax^2 + bx + c = 0 (Quadratic Equation)
    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter constant c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
            solveLinearEquation(scanner); // Solve as a linear equation instead
        } else {
            double delta = b * b - 4 * a * c;
            
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct roots: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has a double root: x = " + x);
            } else {
                System.out.println("The equation has no real roots.");
            }
        }
    }
}
