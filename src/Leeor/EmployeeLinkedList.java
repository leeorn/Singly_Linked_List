package Leeor;

public class EmployeeLinkedList
{
    private EmployeeNode head;
    private int size = 0;

    //to add an employee (given first, last name and id)
    public void addToStart(Employee employeeToAdd){

        //creating a new employeeNode Obj
        EmployeeNode node = new EmployeeNode(employeeToAdd);

        //setting the next to the previous obj. which is where head is
        // pointing at
        node.setNext(head);

        //changing head to the new obj. since we added at front
        head = node;

        size++;
    }

    public Employee removeFromBeginning() {

        if (isEmpty())
            return null;

        EmployeeNode temp = head;
        head = temp.next;
        //set the pointer to null
        temp.setNext(null);
        size--;

        return temp.getEmployee();
    }

    //to get the size of the linked list
    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    //to print the list
    public void printList() {
        EmployeeNode current = head;

        System.out.println("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
            System.out.println("");
        }

        System.out.print("Null");

    }

}
