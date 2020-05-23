public class ContactFile {
    public static void main(String[] args) {
        System.out.println("======ADMIN=========");
        ContactManager adminProxy=new ContactManagerProxy("admin","admin");
        adminProxy.readContacts();
        adminProxy.editContact();
        System.out.println("======USER==========");
        ContactManager userProxy=new ContactManagerProxy("user","user");
        userProxy.editContact();
        userProxy.readContacts();
    }
}
