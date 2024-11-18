public class Resource {
    private String category;
    private String name;
    private String location;
    private String details;

    public Resource(String category, String name, String location, String details) {
        this.category = category;
        this.name = name;
        this.location = location;
        this.details = details;
    }
    public String getCategory(){
        return category;
    }
    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }
    public String getDetails(){
        return details;
    }

    @Override
    public String toString() {
        String border = "+--------------------------------+";
        return border + "\n| Category: " + category + " |\n" +
                " Name: " + name + " \n" +
                " Location: " + location + " \n" +
                " Details: " + details + " \n" +
                border;
    }
}
