package Homework3;

public class FinancialRecord {
    public String name;
    private int incomes;
    private int outcomes;
    public FinancialRecord(int prodIncomes, int prodOutcomes) {
        this.incomes = prodIncomes;
        this.outcomes = prodOutcomes;
    }
    public int getIncomes() {
         return incomes;
    }
    public int getOutcomes() {
        return outcomes;
    }
    public int setIncomes(int newIncomes) {
        this.incomes = newIncomes;
        return newIncomes;
    }
}
