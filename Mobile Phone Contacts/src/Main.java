public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("123-456-789");

        Contact contact1 = Contact.createContact("Alice", "111-222-333");
        Contact contact2 = Contact.createContact("Bob", "444-555-666");
        Contact contact3 = Contact.createContact("Charlie", "777-888-999");

        // Adăugare contacte
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.printContacts();

        // Încercare adăugare contact duplicat
        System.out.println("Adding duplicate contact:");
        mobilePhone.addNewContact(contact1);

        // Actualizare contact
        Contact newContact1 = Contact.createContact("Alice", "999-999-999");
        System.out.println("Updating contact:");
        mobilePhone.updateContact(contact1, newContact1);
        mobilePhone.printContacts();

        // Ștergere contact
        System.out.println("Removing contact:");
        mobilePhone.removeContact(contact2);
        mobilePhone.printContacts();

        // Căutare contact
        System.out.println("Querying contact:");
        Contact queriedContact = mobilePhone.queryContact("Alice");
        if (queriedContact != null) {
            System.out.println("Found: " + queriedContact.getName() + " -> " + queriedContact.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
    }
}