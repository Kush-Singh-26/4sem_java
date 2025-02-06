package Loan_Management_2247;

public class LoanApplication {
    private int applicationId;
    private Customer customer;
    private Loan loan;
    private String loanPurpose;
    private double loanAmount;
    private int loanTenure;
    private LoanStatus applicationStatus;

    public LoanApplication(int applicationId, Customer customer, Loan loan, String purpose, double amount, int tenure) {
        this.applicationId = applicationId;
        this.customer = customer;
        this.loan = loan;
        this.loanPurpose = purpose;
        this.loanAmount = amount;
        this.loanTenure = tenure;
        this.applicationStatus = LoanStatus.PENDING; 
    }

    public int getApplicationId() { return applicationId; }
    public Customer getCustomer() { return customer; }
    public Loan getLoan() { return loan; }
    public String getPurpose() { return loanPurpose; }
    public double getAmount() { return loanAmount; }
    public int getTenure() { return loanTenure; }
    public LoanStatus getStatus() { return applicationStatus; }
    public void setStatus(LoanStatus status) { this.applicationStatus = status; }
}