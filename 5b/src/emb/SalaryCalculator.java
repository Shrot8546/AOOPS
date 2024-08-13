package emb;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        if (employee.getRole().equals("Manager")) {
            return 50000.0;
        } else if (employee.getRole().equals("Developer")) {
            return 40000.0;
        } else {
            return 30000.0;
        }
    }
}

