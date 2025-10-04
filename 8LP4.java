// Abstract class Employee
abstract class Employee {
    protected String name;
    protected double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method
    abstract double calculateBonus();
}

// Interface Payable
interface Payable {
    void generatePaySlip();
}

// Concrete class Manager extending Employee and implementing Payable
class Manager extends Employee implements Payable {
    private String department;

    // Constructor
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    // Implement abstract method from Employee
    @Override
    double calculateBonus() {
        // Let's say bonus = 20% of salary
        return salary * 0.20;
    }

    // Implement interface method from Payable
    @Override
    public void generatePaySlip() {
        double bonus = calculateBonus();
        double totalPay = salary + bonus;

        System.out.println("---------- PAY SLIP ----------");
        System.out.println("Employee Name : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Base Salary   : ₹" + salary);
        System.out.println("Bonus (20%)   : ₹" + bonus);
        System.out.println("Total Pay     : ₹" + totalPay);
        System.out.println("------------------------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Arun Kumar", 75000, "Human Resources");
        manager.generatePaySlip();
    }
}
