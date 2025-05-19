import java.util.Objects;

public class Employee {
    private static int number = 0;
    private int id;
    private String lastName;
    private String ferstName;
    private String middleName;
    private int department;
    private int salary;

    public Employee(String lastName, String ferstName, String middleName, int department, int salary) {
        this.lastName = lastName;
        this.ferstName = ferstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = number++;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFerstName() {
        return this.ferstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFerstName(String ferstName) {
        this.ferstName = ferstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return this.salary;

    }

    public String toString() {
        return "ID " + id + " Сотрудник - " + this.lastName + this.ferstName + this.middleName + "отдел -" + this.department + " зарплата - " + this.salary;
    }
    public String toStringFullName() {
        return  this.lastName + this.ferstName + this.middleName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Employee otherEmployee = (Employee) other;
        return lastName.equals(otherEmployee.lastName) &&
                ferstName.equals(otherEmployee.ferstName) &&
                middleName.equals(otherEmployee.middleName) &&
                department == otherEmployee.department &&
                salary == otherEmployee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, ferstName, middleName, department, salary);
    }
}