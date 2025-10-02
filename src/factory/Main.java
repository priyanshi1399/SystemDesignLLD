package factory;

public class Main {

    public static void main(String[] args) {
        Employee emp=EmployeeFactory.getEmployee("Web Developer");
        int salary=emp.salary();
        System.out.println("the salary of Web Developer is "+salary);
    }


}
