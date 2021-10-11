package Lesson_05;

public class Employee {
    private String fullName;
    private String jobTitle;
    private double employeeSalary;

    public Employee(String fullName, String jobTitle) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee: " + fullName + "\n" +
                "Job Title: " + jobTitle + "\n" +
                "Salary: " + employeeSalary + "\n";
    }
}
