import java.util.Scanner;

public class Main {
    private static Account[] accounts = new Account[50];
    private static Resource[] resources = new Resource[50];
    private static int accountCount = 0;
    private static int resourceCount = 0;
    private static Display d = new Display();
    private static Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) {
        resources[resourceCount++] = new Resource("Healthcare", "Batangas Medical Center", "Batangas City", "Open Hours : 24hrs \n Contact Information : Globe - 0917712874");
        resources[resourceCount++] = new Resource("Educational", "Batangas State University", "Batangas City", "Open Hours : 7AM - 7PM \n Contact Information : (043) 722 0818");
        resources[resourceCount++] = new Resource("Food", "Johanna's Grille", "Q364+9V9, P. Burgos, Batangas, 4200 Batangas", "Open Hours : 9AM - 9PM \n Contact Information : (043) 425 4866");
        resources[resourceCount++] = new Resource("Transportation", "Batangas City Grand Terminal", "Grand Terminal, Diversion Road, Batangas", "Open Hours : 24hrs ");

        while (true){
            try{
            d.getDisplayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("+-----------------------------------+");
                    System.out.println("|   Thank you for using the system. |");
                    System.out.println("+-----------------------------------+");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|   Invalid option. Please try again.   |");
                    System.out.println("+---------------------------------------+");
                    break;
                }
            } catch (Exception e) {
                System.out.println("+---------------------------------------+");
                System.out.println("|   Invalid input. Please try again.    |");
                System.out.println("+---------------------------------------+");
                scanner.nextLine();
            }
        }
    }

    public static void login(){
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        for (int i = 0 ; i < accountCount ; i++) {
            if (accounts[i].getUsername().equals(username) && accounts[i].getPassword().equals(password)) {
                System.out.println("+------------------+");
                System.out.println("| Login Successful |");
                System.out.println("+------------------+");
                
                if (accounts[i] instanceof User){
                    userMenu((User) accounts[i]);
                } else if (accounts[i] instanceof Admin) {
                    adminMenu((Admin) accounts[i]);
                }
                return;
            }
        }
        System.out.println("+-----------------------------------+");
        System.out.println("|   Invalid username or password.   |");
        System.out.println("+-----------------------------------+");
    }

    public static void register(){
        if (accountCount >= accounts.length) {
            System.out.println("+-----------------------------------+");
            System.out.println("|   Maximum account limit reached.  |");
            System.out.println("+-----------------------------------+");
            return;
    }

    System.out.print("Enter username: ");
    String username = scanner.nextLine();
    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    if (password.contains("@")){
        accounts[accountCount++] = new Admin(username, password);
        System.out.println("+---------------------------------------+");
        System.out.println("|   Registration successful as admin.   |");
        System.out.println("+---------------------------------------+");
        } 
    else {
        accounts[accountCount++] = new User(username, password);
        System.out.println("+--------------------------------------+");
        System.out.println("|   Registration successful as user.   |");
        System.out.println("+--------------------------------------+");
        }
    }

    public static void userMenu(User user){
        while (true) {
            try {
            d.getDisplayUser(user);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewCategory();;
                break;
                case 2:
                    System.out.println("+-----------------------------------+");
                    System.out.println("|   Logout successful. Goodbye!     |");
                    System.out.println("+-----------------------------------+");
                return;
                }
            } catch (Exception e) {
                System.out.println("+---------------------------------------+");
                System.out.println("|   Invalid input. Please try again.    |");
                System.out.println("+---------------------------------------+");
                scanner.nextLine();
            }
        }
    }
    
    public static void adminMenu(Admin admin){
        while (true) {
            try {
            d.getDisplayAdmin(admin);
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    addResource(admin);
                break;
                case 2:
                    removeResource(admin);
                break;
                case 3:
                    viewCategory();
                break;
                case 4:
                    System.out.println("+-----------------------------------+");
                    System.out.println("|   Logout successful. Goodbye!     |");
                    System.out.println("+-----------------------------------+");
                return;
                default:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|   Invalid choice. Please try again.   |");
                    System.out.println("+---------------------------------------+");
                }
            } catch (Exception e) {
                System.out.println("+---------------------------------------+");
                System.out.println("|   Invalid input. Please try again.    |");
                System.out.println("+---------------------------------------+");
                scanner.nextLine();
            }
        }
    }

    public static void viewCategory(){
        d.viewResources();
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        String category;
        switch (choice) {
            case 1:
                category = "Healthcare";
                break;
            case 2:
                category = "Educational";
                break;
            case 3:
                category = "Food";
                break;
            case 4:
                category = "Transportation";
                break;
            default:
            System.out.println("+---------------------------------------+");
            System.out.println("|   Invalid choice. Please try again.   |");
            System.out.println("+---------------------------------------+");
            return;

        }
        System.out.println("+---------------------------------------+");
        System.out.println(" Resources in " + category );
        System.out.println("+---------------------------------------+");
        boolean found = false;
        for (int i = 0 ; i < resourceCount ; i++) {
            Resource resource = resources[i];
            if (resources != null && resource.getCategory().equals(category)) {
                System.out.println(resource);
                found = true;
            }
        }
        if (!found) {
            System.out.println("+------------------------------------------+");
            System.out.println("|   No resources found in this category.   |");
            System.out.println("+------------------------------------------+");
        }
    }

    public  static void addResource(Admin admin) {
        if (resourceCount >= resources.length) {
            System.out.println("+-----------------------------------+");
            System.out.println("|   Maximum resource limit reached. |");
            System.out.println("+-----------------------------------+");
            return;
        }

        d.viewResources();
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        String category;
        switch (choice) {
            case 1:
                category = "Healthcare";
                break;
            case 2:
                category = "Educational";
                break;
            case 3:
                category = "Food";
                break;
            case 4:
                category = "Transportation";
                break;
            default:
            System.out.println("+---------------------------------------+");
            System.out.println("|   Invalid choice. Please try again.   |");
            System.out.println("+---------------------------------------+");
            return;
        }
        
        System.out.print("Enter resource name: ");
        String name = scanner.nextLine();
        System.out.print("Enter location: ");
        String location = scanner.nextLine();
        System.out.print("Enter details: ");
        String details = scanner.nextLine();

        resources[resourceCount++] = new Resource(category, name, location, details);
        System.out.println("+-----------------------------------+");
        System.out.println("|   Resource added successfully.    |");
        System.out.println("+-----------------------------------+");
    }
    
    public static void removeResource(Admin admin) {
        System.out.print("Enter resource name: ");
        String name = scanner.nextLine();

        for (int i = 0 ; i < resourceCount; i++){
            if (resources[i].getName().equals(name)) {
                for (int j = i; j < resourceCount - 1; j++) {
                    resources[j] = resources[j + 1];
                }
                resources[--resourceCount] = null;
                System.out.println("+-----------------------------------+");
                System.out.println("|   Resource removed successfully.  |");
                System.out.println("+-----------------------------------+");
            }
        }
            System.out.println("+-----------------------------------+");
            System.out.println("|   No resources found to remove.   |");
            System.out.println("+-----------------------------------+");
    }

    

}
