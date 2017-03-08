/**
 */
public class ContactNode {

    private String contactName;
    private String contactPhoneNumber;
    private ContactNode nextNodePtr;

    public ContactNode(String name, String phoneNumber) {
        this.contactName = name;
        this.contactPhoneNumber = phoneNumber;
    }

    public String getName() {
        return this.contactName;
    }

    public String getPhoneNumber() {
        return this.contactPhoneNumber;
    }

    /**
     * insertAfter method is called on an instance of ContactNode object and inserts insertedNode object after
     * the instance object.
     * @param insertedNode is the node to be inserted.
     */
    public void insertAfter(ContactNode insertedNode) {
        insertedNode.nextNodePtr = this.nextNodePtr;
        this.nextNodePtr = insertedNode;

    }

    public ContactNode getNext () {
        return this.nextNodePtr;
    }

    public String toString() {
        String returnVal;
        returnVal = "Name: " + this.contactName + "\nPhone number: " + this.contactPhoneNumber + "\n";
        return returnVal;

    }
}
