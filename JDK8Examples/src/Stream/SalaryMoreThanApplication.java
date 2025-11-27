package Stream;

import java.util.stream.Stream;

class Employee {
    private int empId;
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee(int empId, String empName, int empAge, double
            empSalary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" +
                empName + ", empAge=" + empAge + ", empSalary=" + empSalary
                + "]";
    }

}
public class SalaryMoreThanApplication {

    static void main(String[] args) {

        Stream.of(new Employee(121, "SWARA", 22, 96000.00),
                new Employee(122, "RAM", 27, 76000.00),
                new Employee(123, "LAKSHMI", 18,
                        50000.00), new Employee(127, "APARNA", 25, 45000.22),
                new Employee(129, "VENKAT", 29,
                        56000.00)).filter(employee -> employee.getEmpSalary()>50000).forEach(System.out::println);




    }

}
