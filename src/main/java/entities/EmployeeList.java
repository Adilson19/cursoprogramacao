package entities;
public class EmployeeList {
    private Integer id;
    private Character name;
    private Double salary;
    
    public EmployeeList(Integer id, Character name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    
    public void setName(Character name){
        this.name = name;
    }
    public Character getName(){
        return name;
    }
    
    public Double getSalary(){
        return salary;
    }
    
    public void searchingSalaryForIncrease(Integer id){
        this.id = id;
    }
    public void setPercentage(Double percent){
        this.salary += percent * 10 / 100;
    }
    
}
