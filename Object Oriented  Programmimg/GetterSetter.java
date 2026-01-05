class Account {
    public String name;
    protected String email;
    private String password;
    

    // getter & setter

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
         this.password = pass;
    }

}

public class GetterSetter {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.name = "Suman";
        ac.email = "suman@gmail.com";
        ac.setPassword("AbC123");
        System.out.println(ac.getPassword());
    }
}
