package Loan_Management_2247;

public class Loan {
    private int loanTypeId;
    private String loanTypeName;
    private int minimumAge;
    private int maximumAge;
    private double minimumSalary;

    public Loan(int loanTypeId, String type, int minAge, int maxAge, double minSalary) {
        this.loanTypeId = loanTypeId;
        this.loanTypeName = type;
        this.minimumAge = minAge;
        this.maximumAge = maxAge;
        this.minimumSalary = minSalary;
    }

    public int getLoanTypeId() { return loanTypeId; }
    public String getType() { return loanTypeName; }
    public int getMinAge() { return minimumAge; }
    public int getMaxAge() { return maximumAge; }
    public double getMinSalary() { return minimumSalary; }
}