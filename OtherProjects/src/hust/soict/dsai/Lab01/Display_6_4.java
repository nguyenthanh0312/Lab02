import java.util.Scanner;
public class Display_6_4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = -1;
        int month = -1;
        String monthInput = "";
        
        while (year < 0) {
            System.out.print("Enter a valid year (non-negative number): ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year < 0) {
                    System.out.println("Year must be a non-negative integer. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid year.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.nextLine(); // Clear buffer

        while (month == -1) {
            System.out.print("Enter a valid month (full name, abbreviation, or number): ");
            monthInput = scanner.nextLine().trim();

            month = getMonthNumber(monthInput);
            if (month == -1) {
                System.out.println("Invalid month. Please try again.");
            }
        }

        int days = getDaysInMonth(month, year);
        System.out.println("The number of days in " + monthInput + " " + year + " is: " + days);
        
        scanner.close();
    }

    // Convert month input to a month number (1-12)
    public static int getMonthNumber(String monthInput) {
        monthInput = monthInput.toLowerCase();
        switch (monthInput) {
            case "1": case "january": case "jan": case "jan.":
                return 1;
            case "2": case "february": case "feb": case "feb.":
                return 2;
            case "3": case "march": case "mar": case "mar.":
                return 3;
            case "4": case "april": case "apr": case "apr.":
                return 4;
            case "5": case "may":
                return 5;
            case "6": case "june": case "jun":
                return 6;
            case "7": case "july": case "jul":
                return 7;
            case "8": case "august": case "aug": case "aug.":
                return 8;
            case "9": case "september": case "sep": case "sep.":
                return 9;
            case "10": case "october": case "oct": case "oct.":
                return 10;
            case "11": case "november": case "nov": case "nov.":
                return 11;
            case "12": case "december": case "dec": case "dec.":
                return 12;
            default:
                return -1;
        }
    }

    // Get number of days in a given month and year
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; // Invalid month
        }
    }

    // Check if the year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

