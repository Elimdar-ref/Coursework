public class Main {

    public static void main(String[] args) {
        Employee[] worker = new Employee[10];
        worker[0] = new Employee("Иванов ", "Иван ", "Иванович ", 1, 90000);
        worker[1] = new Employee("Петров ", "Петр ", "Петрович ", 2, 70000);
        worker[2] = new Employee("Михайлов ", "Михаил ", "Михайлович ", 3, 60000);
        worker[3] = new Employee("Сергеева ", "Екатерина ", "Сергеевна ", 5, 150000);
        worker[4] = new Employee("Васильев ", "Василий ", "Васильвич ", 4, 130000);
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] != null) {
            System.out.println(worker[i]);
            }
        }
        System.out.println("Сумма затрат за месяц составила " + calculateSumOfSalaries(worker) + " рублей");
        Employee employee = findEmployeeWithMinSalary(worker);
        System.out.println("Сотрудник с минимальной ЗП - " + employee.getLastName() + employee.getFerstName() +
                employee.getMiddleName() + employee.getDepartment() + " отдел " + employee.getSalary() + " рублей");
        Employee employees = findEmployeeWithMaxSalary(worker);
        System.out.println("Cотрудник с максимальной ЗП " + employees.getLastName() + employees.getFerstName() +
                employees.getMiddleName() + employees.getDepartment() + " отдел " + employees.getSalary() + " рублей");
        System.out.println("Средняя ЗП за месяц составила " + calculateAverageOfSalaries(worker) + " рублей");
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] != null) {
        System.out.println(worker[i].toStringFullName());
            }
        }
    }

    private static int calculateSumOfSalaries(Employee[] worker) {
        int sum = 0;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] != null) {
                sum += worker[i].getSalary();
            }
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary(Employee[] worker) {
        Employee employeeWithMinSalar = null;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] != null && (employeeWithMinSalar == null || worker[i].getSalary() < employeeWithMinSalar.getSalary())) {
                employeeWithMinSalar = worker[i];
            }
        }
        return employeeWithMinSalar;
    }

    private static Employee findEmployeeWithMaxSalary(Employee[] worker) {
        Employee employeeWithMinSalar = null;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] != null && (employeeWithMinSalar == null || worker[i].getSalary() > employeeWithMinSalar.getSalary())) {
                employeeWithMinSalar = worker[i];
            }
        }
        return employeeWithMinSalar;
    }

    private static double calculateAverageOfSalaries(Employee[] worker) {
        return (double) calculateSumOfSalaries(worker) / worker.length;
    }
}