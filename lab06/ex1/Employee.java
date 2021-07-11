package ex1;

// Sweets

public class Employee {
    
    private String name;
    private long emp_num;
    private double salary;

    public Employee(String name, long emp_num, double salary) {
        this.name = name;
        this.emp_num = emp_num;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getEmp_num() {
        return emp_num;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return String.format("%-20s (%s) | Salary: %s", this.name, this.emp_num, this.salary);
    }
    
}