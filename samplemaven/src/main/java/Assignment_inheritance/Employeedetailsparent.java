package Assignment_inheritance;

public class Employeedetailsparent//Parent Class: EmployeeDetails
 {
 protected double basicPay;
 protected double deduction;
 protected double bonus;

 // Method to set employee details with default inputs
 public void setEmployeeDetails() {
     this.basicPay = 50000.0;   // Default Basic Pay
     this.deduction = 5000.0;  // Default Deduction
     this.bonus = 2000.0;      // Default Bonus
 }
}
