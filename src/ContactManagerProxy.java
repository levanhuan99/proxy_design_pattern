public class ContactManagerProxy implements ContactManager {
    private String username="admin";
    private String password="admin";
    private boolean isLogin=false;

    ContactManagerImpl contactManager;
    public ContactManagerProxy (String username,String password){
        contactManager=new ContactManagerImpl();
        if (username.equals(this.username)&&password.equals(this.password)){
            this.isLogin=true;
        }
    }
    @Override
    public void readContacts() {
        contactManager.readContacts();
    }

    @Override
    public void editContact() {
        if (isLogin()) {
            contactManager.editContact();
        }else {
            System.out.println("do not have permission to edit");
        }
    }
    private boolean isLogin(){
        return (isLogin==true);
    }
}
