package Loan_Management_2247;

import java.util.Scanner;

public class LoanManagerClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoanManager loanManager = new LoanManager();
        while (true) {
            System.out.println("1. Apply for a new Loan");
            System.out.println("2. View All Loan Application Status");
            System.out.println("3. Exit");
            System.out.print("Enter choice[1/2/3]: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    applyForNewLoan(scanner, loanManager);
                    break;
                case 2:
                    viewAllLoanApplications(loanManager);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void applyForNewLoan(Scanner scanner, LoanManager loanManager) {
        int loanTypeId;
        Customer customer;
        Loan loan;

        while (true) {
            System.out.print("Select a Loan Type Id (1-Personal, 2-Home, 3-Car): ");
            loanTypeId = scanner.nextInt();
            loan = loanManager.getLoanTypeDetail(loanTypeId);
            if (loan != null) {
                break;
            }
            System.out.println("Invalid loan type ID. Please try again.");
        }
        Customer[] customers = loanManager.getCustomers();
        for(Customer customer1 : customers) {
            System.out.println(customer1.getCustomerId() + " - " + customer1.getName());
        }

        while (true) {
            System.out.print("Select a Customer Id (1-5): ");
            int customerId = scanner.nextInt();
            scanner.nextLine(); 
            customer = loanManager.getCustomer(customerId);
            if (customer != null) {
                break;
            }
            System.out.println("Invalid customer ID. Please try again.");
        }

        System.out.print("Enter Purpose of Loan: ");
        String purpose = scanner.nextLine();
        System.out.print("Enter Amount of Loan: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter Tenure of Loan (in months): ");
        int tenure = scanner.nextInt();
        scanner.nextLine(); 

        LoanApplication loanApplication = new LoanApplication(loanManager.getApplicationCount() + 1, customer, loan, purpose, amount, tenure);
        String statusMessage = loanManager.applyForLoan(loanApplication);
        System.out.println(statusMessage);
    }



    private static void viewAllLoanApplications(LoanManager loanManager) {
        for (int i = 0; i < loanManager.getApplicationCount(); i++) {
            LoanApplication application = loanManager.getApplications()[i];
            if (application != null) {
                System.out.println("Application ID: " + application.getApplicationId() +
                        "\nCustomer: " + application.getCustomer().getName() +
                        "\nLoan Type: " + application.getLoan().getType() +
                        "\nPurpose: " + application.getPurpose() +
                        "\nAmount: " + application.getAmount() +
                        "\nTenure: " + application.getTenure() +
                        "\nStatus: " + application.getStatus() +
                        "\n-----------------------------");
            }
        }
    }
}