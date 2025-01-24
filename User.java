import java.util.*;

// User Class
class User {
    private String name;
    private ArrayList<Transaction> transactions;
    private double budget;
    private double savingsGoal;

    public User(String name, double budget, double savingsGoal) {
        this.name = name;
        this.budget = budget;
        this.savingsGoal = savingsGoal;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public double calculateTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t instanceof Expense) {
                total += t.getAmount();
            }
        }
        return total;
    }

    public double calculateTotalIncome() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t instanceof Income) {
                total += t.getAmount();
            }
        }
        return total;
    }

    public void generateReport() {
        System.out.println("\n--- Financial Report for " + name + " ---");
        System.out.println("Budget: $" + budget);
        System.out.println("Savings Goal: $" + savingsGoal);
        System.out.println("\nTransactions:");

        for (Transaction t : transactions) {
            System.out.println(t);
        }

        double totalExpenses = calculateTotalExpenses();
        double totalIncome = calculateTotalIncome();
        double netBalance = totalIncome - totalExpenses;

        System.out.println("\nTotal Income: $" + totalIncome);
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Net Balance: $" + netBalance);

        if (netBalance >= savingsGoal) {
            System.out.println("Congratulations! You've met your savings goal.");
        } else {
            System.out.println("You need $" + (savingsGoal - netBalance) + " more to reach your savings goal.");
        }
    }

    public void sortTransactionsByAmount() {
        transactions.sort(Comparator.comparingDouble(Transaction::getAmount));
    }
}
