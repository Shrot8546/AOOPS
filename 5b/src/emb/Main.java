package emb;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Manager");
        double salary = new SalaryCalculator().calculateSalary(employee);
        System.out.println("Employee " + employee.getName() + " has a salary of " + salary);
    }
}
