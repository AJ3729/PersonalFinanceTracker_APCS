// Base Transaction Class
public abstract class Transaction {
    private double amount;
    private String category;
    private String date;
    private String description;

    public Transaction(double amount, String category, String date, String description) {
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public abstract String toString();
}
