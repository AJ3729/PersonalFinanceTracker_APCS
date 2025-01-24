// Expense Subclass
class Expense extends Transaction {
    public Expense(double amount, String category, String date, String description) {
        super(amount, category, date, description);
    }

    @Override
    public String toString() {
        return "Expense: " + getDescription() + " | Amount: -$" + getAmount() + " | Category: " + getCategory()
                + " | Date: " + getDate();
    }
}
