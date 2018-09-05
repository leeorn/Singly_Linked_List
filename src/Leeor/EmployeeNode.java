package Leeor;

public class EmployeeNode {

    Employee employee;
    EmployeeNode next;

    //Constructor
    public EmployeeNode(Employee employee)
    {
        this.employee = employee;
    }

    //Getter and setters
    public Employee getEmployee()
    {
        return employee;
    }

    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }

    public EmployeeNode getNext()
    {
        return next;
    }

    public void setNext(EmployeeNode next)
    {
        this.next = next;
    }


    public String toString() {
        return employee.toString();
    }
}