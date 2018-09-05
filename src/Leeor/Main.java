package Leeor;

public class Main {

    public static void main(String[] args) {

        //Linked List Implementation
        Employee one = new Employee ("Josh", "Cooper", 15);
        Employee two = new Employee ("Bill", "Nixon", 23);
        Employee three = new Employee ("Coco", "Billibao", 27);
        Employee four = new Employee ("Jo", "Bio", 97);

        EmployeeLinkedList employee = new EmployeeLinkedList();
        employee.addToStart(one);
        employee.addToStart(two);
        employee.addToStart(three);
        employee.addToStart(four);

        employee.removeFromBeginning();

        employee.printList();



    }
}
