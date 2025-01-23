package Assignment_inheritance;

//Child Class: SalaryComponents
public class SalarycomponentChildclass1 extends Employeedetailsparent
{
 protected double hra;
 protected double pf;

 // Method to calculate HRA and PF
 public void calculateHRAandPF() {
     this.hra = 0.05 * this.basicPay; // HRA is 5% of basic pay
     this.pf = 0.20 * this.basicPay;  // PF is 20% of basic pay
 }
}
