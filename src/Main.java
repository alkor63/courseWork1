import java.util.Arrays;
public class Main {
    public static int[] generateRandomArray(int arrLen, int maxValue) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[arrLen];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue);
        }
        return arr;
    }

    public static void main(String[] args) {

        int numEmployee = 10;

        Employee[] employees = new Employee[numEmployee];
        int[] dep = generateRandomArray(numEmployee, 5); // department number
        int[] salaryInt = generateRandomArray(numEmployee,100_000); // salary
        employees[0] = new Employee("Зайцев", "Игорь", "Николаевич", 1+dep[0], 80000.0+salaryInt[0]);
        employees[1] = new Employee("Корниенко", "Дмитрий", "Алексеевич", 1+dep[1], 80000.0+salaryInt[1]);
        employees[2] = new Employee("Калистов", "Геннадий", "Анатольевич", 1+dep[2], 80000.0+salaryInt[2]);
        employees[3] = new Employee("Колганова", "Алёна", "Евгеньевна", 1+dep[3], 80000.0+salaryInt[3]);
        employees[4] = new Employee("Минин", "Константин", "Николаевич", 1+dep[4], 80000.0+salaryInt[4]);
        employees[5] = new Employee("Моисеенко", "Андрей", "Александрович", 1+dep[5], 80000.0+salaryInt[5]);
        employees[6] = new Employee("Адамович", "Евгений", "Юрьевич", 1+dep[6], 80000.0+salaryInt[6]);
        employees[7] = new Employee("Карпов", "Михаил", "Юрьевич", 1+dep[7], 80000.0+salaryInt[7]);
        employees[8] = new Employee("Кухарев", "Андрей", "Николаевич", 1+dep[8], 80000.0+salaryInt[8]);
        employees[9] = new Employee("Гапонов", "Эдуард", "Евгеньевич", 1+dep[9], 80000.0+salaryInt[9]);

        for (int j = 0; j < employees.length; j++)
        System.out.println(employees[j]+"\tоклад: "+employees[j].getSalary());

        double printSalary = EmployeeService.minSalary(employees);
        System.out.println("Минимальная зарплата: "+ printSalary);
        System.out.println("Максимальная зарплата: "+ EmployeeService.maxSalary(employees));
        System.out.println("Суммарная зарплата: "+ EmployeeService.sumSalary(employees));
    }

}