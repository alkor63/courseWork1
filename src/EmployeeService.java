public class EmployeeService {
    public static double minSalary(Employee[] employees) {
// ищем в массиве минимальное значение
        double minSal = employees[0].getSalary();
        for (int j = 1; j < employees.length; j++) {
            if (employees[j] != null){
                if (employees[j].getSalary() < minSal) {
                    minSal = employees[j].getSalary();
                }
            }
        }
        return minSal;
    }

    // ищем в массиве минимальное значение, возвращаем его индекс
    public static int minSalaryIndex(Employee[] employees) {
        double minSal = employees[0].getSalary();
        int minSalIndex = 0;
        for (int j = 1; j < employees.length; j++) {
            if (employees[j] != null){
                if (employees[j].getSalary() < minSal) {
                    minSal = employees[j].getSalary();
                    minSalIndex = j;
                }
            }
        }
        return minSalIndex;
    }

    // ищем в массиве максимальное значение
    public static double maxSalary(Employee[] employees) {
        double max = employees[0].getSalary();
        for (int j = 1; j < employees.length; j++)
            if (employees[j].getSalary() > max) max = employees[j].getSalary();
        return max;
    }
    // ищем в массиве максимальное значение, возвращаем его индекс
    public static int maxSalaryIndex(Employee[] employees) {
        double maxSal = employees[0].getSalary();
        int maxSalIndex = 0;
        for (int j = 1; j < employees.length; j++) {
            if (employees[j] != null){
                if (employees[j].getSalary() > maxSal) {
                    maxSal = employees[j].getSalary();
                    maxSalIndex = j;
                }
            }
        }
        return maxSalIndex;
    }



// ищем сумму зарплат в массиве
// и думаем как передать "наверх" количество слагаемых
// для вычисления среднего значения
    static int numPersons;
    public static int getNumPersons() {
        return numPersons;
    }


    public static double sumSalary(Employee[] employees) {
        double sum = 0.0;
        numPersons = 0;
        for (int j = 0; j < employees.length; j++) {
            sum = sum + employees[j].getSalary();
            numPersons++;
        }
        return sum;
    }

}
