public class EmployeeService {

    public static double minSalary(Employee employees[]) {
        double min = employees[0].getSalary();
        for (int j = 1; j < employees.length; j++)
            if (employees[j].getSalary() < min) min = employees[j].getSalary();
        return min;
    }

    public static double maxSalary(Employee employees[]) {
        double max = employees[0].getSalary();
        for (int j = 1; j < employees.length; j++)
            if (employees[j].getSalary() > max) max = employees[j].getSalary();
        return max;
    }

    public static double sumSalary(Employee employees[]) {
        double sum = 0.0;
        for (int j = 0; j < employees.length; j++)
            sum = sum + employees[j].getSalary();
        return sum;
    }
}
