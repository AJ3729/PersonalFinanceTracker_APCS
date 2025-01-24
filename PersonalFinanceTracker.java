import java.util.*;

// Main Class
public class PersonalFinanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your monthly budget: ");
        double budget = scanner.nextDouble();

        System.out.print("Enter your savings goal: ");
        double savingsGoal = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        User user = new User(name, budget, savingsGoal);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Expense");
            System.out.println("2. Add Income");
            System.out.println("3. View Report");
            System.out.println("4. Sort Transactions by Amount");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter expense amount: ");
                    double expenseAmount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter expense category: ");
                    String expenseCategory = scanner.nextLine();

                    System.out.print("Enter expense date (YYYY-MM-DD): ");
                    String expenseDate = scanner.nextLine();

                    System.out.print("Enter expense description: ");
                    String expenseDescription = scanner.nextLine();

                    user.addTransaction(new Expense(expenseAmount, expenseCategory, expenseDate, expenseDescription));
                    System.out.println("Expense added successfully!");
                    break;

                case 2:
                    System.out.print("Enter income amount: ");
                    double incomeAmount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter income category: ");
                    String incomeCategory = scanner.nextLine();

                    System.out.print("Enter income date (YYYY-MM-DD): ");
                    String incomeDate = scanner.nextLine();

                    System.out.print("Enter income description: ");
                    String incomeDescription = scanner.nextLine();

                    user.addTransaction(new Income(incomeAmount, incomeCategory, incomeDate, incomeDescription));
                    System.out.println("Income added successfully!");
                    break;

                case 3:
                    user.generateReport();
                    break;

                case 4:
                    user.sortTransactionsByAmount();
                    System.out.println("Transactions sorted by amount.");
                    break;

                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
