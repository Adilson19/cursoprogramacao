package entities;
public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    public double netSalary(){
        double resultSalary;
        return resultSalary = grossSalary - tax;
    }
    
    public void increaseSalary(double percentage){
        double increase;
        increase = this.grossSalary + (this.grossSalary * percentage);
        double resultIncrease;
        resultIncrease = increase - this.tax;
    }
    
    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }
}
