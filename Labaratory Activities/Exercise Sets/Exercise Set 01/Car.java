package Encapsulation;

class Car{
    private  String color;
    private  double price;
    private char size;

    public Car(String color, double price, char size){
        setColor(color);
        setPrice(price);
        setSize(Character.toUpperCase(size));
    }

    public String getColor(){
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize(){
        return size;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(double price){
        if(price > 0)
            this.price = price;
    }

    public void setSize(char size){
        switch (size) {
            case 'S':
            case 'M':
            case 'L':
                this.size = size;
                break;
            default:
                System.out.println("Invalid size. Please use 'S', 'M', or 'L'.");
                break;
        }
    }

    private String getSizeDescriptor() {
        switch (size) {
            case 'S':
                return "Small";
            case 'M':
                return "Medium";
            case 'L':
                return "Large";
            default:
                return "unknown";
        }
    }

    public String toString(){
        return "Car (" + color +") - P" + String.format("%.2f", price) + " - " + getSizeDescriptor();
    }

    public static void main (String[] args) {

        Car redCar = new Car("red", 19999.85,'m');
        Car blueCar = new Car("blue",50000,'S');

        System.out.println(redCar);
        System.out.println(blueCar);
    }

}

