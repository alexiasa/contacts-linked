/**
 */

import java.util.Scanner;

public class ContactList {

    private ContactNode head;
    private ContactNode tail;

    public ContactList () {
        this.head = null;
        this.tail = null;
    }

    /**
     * This method adds a node to the end of the list. This node will be the new tail. If the list is empty, then the
     * node will be the new head and tail of the list.
     * @param newContact accepts a ContactNode object to be appended at the end of the list.
     *
     */
    public void append (ContactNode newContact) {
        if (this.head == null) {
            this.head = newContact;
            this.tail = newContact;
        }
        else {
            this.listInsertAfter(this.tail, newContact);
        }

    }

    /**
     * listInsertAfter handles inserting the newNode object into linked list after the currentNode object. If
     * the currentNode is the tail of the list, then newNode becomes the tail.
     * @param currentNode is the ContactNode object after which newNode will be inserted.
     * @param newNode is the ContactNode object to be added to the linked list.
     */
    public void listInsertAfter(ContactNode currentNode, ContactNode newNode) {
        currentNode.insertAfter(newNode);
        if (this.tail == currentNode) {
            this.tail = newNode;
        }

    }

    public String toString () {
        ContactNode ptr = this.head;
        String returnVal = "";
        while (ptr != null) {
            returnVal += ptr;
            ptr = ptr.getNext();
            returnVal += "\n";
        }

        return returnVal;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        ContactList contactz = new ContactList();

        for(int i = 1; i < 4; i ++) {
            System.out.println("Person " + i);
            System.out.println("Enter name:");
            String contactName = input.nextLine();

            System.out.println("Enter phone number:");
            String contactPhone = input.nextLine();

            System.out.println("You entered: " + contactName + ", " + contactPhone + "\n");

            ContactNode newContact = new ContactNode(contactName, contactPhone);
            contactz.append(newContact);
        }

        System.out.println("CONTACT LIST");
        System.out.println(contactz.toString());





    }


}
