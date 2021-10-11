package Lesson_05;

import java.util.ArrayList;
import java.util.List;

public class ExerciseWeek05_AnhDo {
    public static void main(String[] args) {
        double totalSalary = 0;

        List<Employee> employeeList = new ArrayList<>();
        Employee ceoEmployee = new Employee("Bill Gates","CEO");
        Employee managerEmployee = new Employee("Elon Musk","Manager");
        Employee firstEmployee = new Employee("Nguyen Van Teo","Employee");
        Employee secondEmployee = new Employee("Nguyen Van Ti","Employee");
        Employee thirdEmployee = new Employee("Nguyen Van Tun","Employee");

        ceoEmployee.setEmployeeSalary(5000);
        managerEmployee.setEmployeeSalary(3000);
        firstEmployee.setEmployeeSalary(1200);
        secondEmployee.setEmployeeSalary(1400);
        thirdEmployee.setEmployeeSalary(1000);

        employeeList.add(ceoEmployee);
        employeeList.add(managerEmployee);
        employeeList.add(firstEmployee);
        employeeList.add(secondEmployee);
        employeeList.add(thirdEmployee);

        System.out.println("Employee list: ");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
            totalSalary += employee.getEmployeeSalary();
        }

        System.out.printf("Total salary that company must pay in total monthly: %.2f $", totalSalary);
    }
}
