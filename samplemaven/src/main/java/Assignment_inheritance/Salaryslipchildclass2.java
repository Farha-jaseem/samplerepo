package Assignment_inheritance;

public class Salaryslipchildclass2 extends SalarycomponentChildclass1 //Child Class: SalarySlip
 {
 private double totalSalary;

 // Method to calculate total salary
 public void calculateTotalSalary() {
     this.totalSalary = this.basicPay + this.hra - this.pf - this.deduction + this.bonus;
 }

 // Method to print the salary slip
 public void printSalarySlip() {
     System.out.println("\n*********** SALARY SLIP ***********");
     System.out.println("Basic Pay: " + this.basicPay);
     System.out.println("Deduction: " + this.deduction);
     System.out.println("HRA: " + this.hra);
     System.out.println("PF: " + this.pf);
     System.out.println("Bonus: " + this.bonus);
     System.out.println("Total Salary (by hand): " + this.totalSalary);
     System.out.println("***********************************");
 }
//Main Class

  public static void main(String[] args) {
      // Create an object of SalarySlip
	  Salaryslipchildclass2 obj = new Salaryslipchildclass2();

      // Set default employee details
      obj.setEmployeeDetails();

      // Calculate HRA and PF
      obj.calculateHRAandPF();

      // Calculate total salary and print the salary slip
      obj.calculateTotalSalary();
      obj.printSalarySlip();
  }
}


