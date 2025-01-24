// Income Subclass
class Income extends Transaction {
    public Income(double amount, String category, String date, String description) {
        super(amount, category, date, description);
    }

    @Override
    public String toString() {
        return "Income: " + getDescription() + " | Amount: +$" + getAmount() + " | Category: " + getCategory()
                + " | Date: " + getDate();
    }
}
