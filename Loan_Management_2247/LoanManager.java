package Loan_Management_2247;

public class LoanManager {
    private  Customer[] customerList = {
        new Customer(1, "Arun", 30, 50000),
        new Customer(2, "Bhavna", 40, 70000),
        new Customer(3, "Cauvery", 25, 45000),
        new Customer(4, "Mukul", 35, 80000),
        new Customer(5, "Nikhil", 29, 60000)
    };

    private  Loan[] loanTypes = {
        new Loan(1, "Personal", 21, 60, 30000),
        new Loan(2, "Home", 25, 65, 50000),
        new Loan(3, "Car", 21, 60, 40000)
    };

    private  LoanApplication[] loanApplications = new LoanApplication[100];
    private  int nextApplicationIndex = 0;

    public  Customer getCustomer(int customerId) {
        for (Customer customer : customerList) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    public  Loan getLoanTypeDetail(int loanTypeId) {
        for (Loan loan : loanTypes) {
            if (loan.getLoanTypeId() == loanTypeId) {
                return loan;
            }
        }
        return null;
    }
    public  Customer[] getCustomers() {
        return customerList;
    }

    public  LoanApplication[] getApplications() {
        return loanApplications;
    }

    public  int getApplicationCount() {
        return nextApplicationIndex;
    }



    public  String applyForLoan(LoanApplication loanApplication) {
        Customer customer = loanApplication.getCustomer();
        Loan loan = loanApplication.getLoan();

        if (customer.getAge() < loan.getMinAge() || customer.getAge() > loan.getMaxAge()) {
            loanApplication.setStatus(LoanStatus.REJECTED);
            return "Sorry, your loan is rejected due to age restrictions.  Must be between " + loan.getMinAge() + " and " + loan.getMaxAge() + ".";
        }

        if (customer.getAnnualSalary() < loan.getMinSalary()) {
            loanApplication.setStatus(LoanStatus.REJECTED);
            return "Sorry, your loan is rejected due to insufficient salary.  Minimum salary required is " + loan.getMinSalary() + ".";
        }

        loanApplication.setStatus(LoanStatus.APPROVED);
        loanApplications[nextApplicationIndex++] = loanApplication;
        return "Congratulations! Your loan is approved.";
    }
}