import java.util.Arrays;
import java.util.SortedMap;

public class Main {
    public static int[] generateRandomArray(int arrLen, int maxValue) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[arrLen];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue);
        }
        return arr;
    } // генератор случайных чисел для "назначения" зарплаты и отдела

    public static void main(String[] args) {

        int numEmployee = 10;   // количество сотрудников

        Employee[] employees = new Employee[numEmployee];
        int[] dep = generateRandomArray(numEmployee, 5); // department number
        int[] salaryInt = generateRandomArray(numEmployee,100_000); // salary
        employees[0] = new Employee("Зайцев", "Николай", "Николаевич", 1+dep[0], 80000.0+salaryInt[0]);
        employees[1] = new Employee("Корниенко", "Дмитрий", "Сергеевич", 1+dep[1], 80000.0+salaryInt[1]);
        employees[2] = new Employee("Калистов", "Геннадий", "Антонович", 1+dep[2], 80000.0+salaryInt[2]);
//        employees[3] = new Employee("Колганова", "Алёна", "Евгеньевна", 1+dep[3], 80000.0+salaryInt[3]);
        employees[4] = new Employee("Минин", "Константин", "Николаевич", 1+dep[4], 80000.0+salaryInt[4]);
        employees[5] = new Employee("Карпов", "Юрий", "Александрович", 1+dep[5], 80000.0+salaryInt[5]);
        employees[6] = new Employee("Адамович", "Евгений", "Юрьевич", 1+dep[6], 80000.0+salaryInt[6]);
        employees[7] = new Employee("Моисеенко", "Михаил", "Иванович", 1+dep[7], 80000.0+salaryInt[7]);
        employees[8] = new Employee("Кухарев", "Андрей", "Николаевич", 1+dep[8], 80000.0+salaryInt[8]);
        employees[9] = new Employee("Гапонов", "Эдуард", "Евгеньевич", 1+dep[9], 80000.0+salaryInt[9]);

        // Выводим список сотрудников со всеми полями
        for (int j = 0; j < employees.length; j++) {
            if (employees[j] != null)
            System.out.println("id: " + employees[j].getId() + "\t" + employees[j] + "\tоклад: " + employees[j].getSalary());
        }
        // Ищем минимальную зарплату (двумя методами)
        double printSalary = EmployeeService.minSalary(employees);
        System.out.println("\nМинимальная зарплата: "+ printSalary);
        int n = EmployeeService.minSalaryIndex(employees); //индекс сотрудника с искомой зарплатой
        System.out.println("Грустный обладатель минимальной зарплаты:");
        System.out.println(employees[n]+"\tоклад: "+employees[n].getSalary());

// Ищем максимальную зарплату (двумя методами)
        System.out.println("\nМаксимальная зарплата: "+ EmployeeService.maxSalary(employees));
        n = EmployeeService.maxSalaryIndex(employees); // для сокращения длины записи индекса
        System.out.println("Счастливый обладатель максимальной зарплаты:");
        System.out.println(employees[n]);
        System.out.println("id: "+ employees[n].getId() +",\tоклад: "+employees[n].getSalary());

        System.out.println("\nСуммарная зарплата: "+ EmployeeService.sumSalary(employees));
        System.out.println("Количество работников = " + EmployeeService.getNumPersons());
        double middleSalary = EmployeeService.sumSalary(employees)/EmployeeService.getNumPersons();
        System.out.println("Средняя зарплата: " + middleSalary);
    }

}