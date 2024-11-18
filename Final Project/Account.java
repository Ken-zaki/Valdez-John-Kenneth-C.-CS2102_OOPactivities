public abstract class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public abstract void displayMenu();
}
class User extends Account {
        public User(String username, String password) {
            super(username, password);
        }
        @Override
        public void displayMenu() {
            System.out.println("User-specific menu options here.");
        }
}

class Admin extends Account {
    public Admin(String username, String password) {
        super(username, password);
    }
    @Override
    public void displayMenu() {
        System.out.println("Admin-specific menu options here.");
    }
} 
