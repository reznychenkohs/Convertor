package GRASP;

public class Main {

    public static void main(String[] args) {
        User user = new User("Anna", 25);
        Address address = new Address("Shevchenko Street, Kharkov");
        user.setAddress(address);
        System.out.println("User name: " + user.getName() + ";" + " User age: " + user.getAge() + ";");
        System.out.println(user.getAddress());
    }
}
