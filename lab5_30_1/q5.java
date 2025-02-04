class Employee {
    final String companyName = "TechCorp";
    
    final void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }
}

class Developer extends Employee {
     void displayCompanyName() {
         System.out.println("Developer's Company: " + companyName);
     }
    // This will show error because method in Employye is final which 
    // prevents it from being overridden.
}

class q5 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        
        emp.displayCompanyName();
    }
}