package ir.ac.kntu;

import java.util.Scanner;

public class Menu {

    private String password;

    private String username;

    public Menu() {
    }

    private Scanner scanner = new Scanner(System.in);

    public void customerOrAdminMenu() {
        Customer customer = new Customer();
        System.out.println("1: Add new customer");
        System.out.println("2: Admin's login");
        int customerOrAdmin = scanner.nextInt();
        if (customerOrAdmin == 1) { //new customer's information
            System.out.println("Welcome to Feri Food. please Enter your phone number");
            customer.setPhoneNumber(scanner.nextBigInteger());
            System.out.println("Enter your Address");
            customer.setAddress(scanner.next());
        }
        if (customerOrAdmin == 2) { //Admin's information
            System.out.println("Enter your Username");
            username = scanner.next();
            System.out.println("Enter password");
            password = scanner.next();
            main();
        }
        if (customerOrAdmin != 1 && customerOrAdmin != 2) {
            System.out.println("Ridi");
        }
    }

    private final Admin admin = new Admin();
    private final ListOfRestaurants lor = new ListOfRestaurants();
    private final Foods foods = new Foods();

    public void main() {
        if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
            System.out.println("1: Open Restaurants");
            System.out.println("2: Sort menu");
            System.out.println("3: Delivery menu");
            System.out.println("4: Restaurant's information");
            System.out.println("5: Exit");
            int input = scanner.nextInt();
            switch (input) {
                case 1: {
                    if ((lor.getRest1Startfd().isBefore(lor.getZdt()) && lor.getRest1Endfd().isAfter(lor.getZdt())) || (lor.getRest1Startsd().isBefore(lor.getZdt()) && lor.getRest1Endsd().isAfter(lor.getZdt()))) {
                        System.out.println("1: " + lor.getRestaurants().get(0).getNameOfRestaurant());
                    }
                    if ((lor.getRest2Startfd().isBefore(lor.getZdt()) && lor.getRest2Endfd().isAfter(lor.getZdt())) || (lor.getRest2Startsd().isBefore(lor.getZdt()) && lor.getRest2Endsd().isAfter(lor.getZdt()))) {
                        System.out.println("2: " + lor.getRestaurants().get(1).getNameOfRestaurant());
                    }
                    if ((lor.getRest3Startfd().isBefore(lor.getZdt()) && lor.getRest3Endfd().isAfter(lor.getZdt())) || (lor.getRest3Startsd().isBefore(lor.getZdt()) && lor.getRest3Endsd().isAfter(lor.getZdt()))) {
                        System.out.println("3: " + lor.getRestaurants().get(2).getNameOfRestaurant());
                    }
                    if (lor.getRest4Start().isBefore(lor.getZdt()) && lor.getRest4End().isAfter(lor.getZdt())) {
                        System.out.println("4: " + lor.getRestaurants().get(3).getNameOfRestaurant());
                    }
                    int s = scanner.nextInt();
                    buyFood(s);
                    break;
                }
                case 2: {

                    break;
                }
                case 3:

                case 4: {
                    for (int i = 1; i <= lor.getRestaurants().size(); i++) {
                        System.out.println(i + " : " + lor.getRestaurants().get(i - 1).getNameOfRestaurant());
                    }
                    int w = scanner.nextInt();
                    showRestaurantInformation(w);
                    break;
                }
                case 5: {
                    return;
                }
                default:
                    break;
            }
        }
    }

    public void buyFood(int input) {
        if (input == 1) {
            if ((lor.getRest1Startfd().isBefore(lor.getZdt()) && lor.getRest1Endfd().isAfter(lor.getZdt())) || (lor.getRest1Startsd().isBefore(lor.getZdt()) && lor.getRest1Endsd().isAfter(lor.getZdt()))) {
                System.out.println("1:" + foods.getFoodNames().get(1) + " -> Price:" + foods.getKfcFoodPrices().get(1));
                System.out.println("2:" + foods.getFoodNames().get(2) + " -> Price:" + foods.getKfcFoodPrices().get(2));
                int myfood = scanner.nextInt();
                System.out.println("You bought " + foods.getFoodNames().get(myfood) + ". Your order has been registered.");
            }
        }
        if (input == 2) {
            if ((lor.getRest2Startfd().isBefore(lor.getZdt()) && lor.getRest2Endfd().isAfter(lor.getZdt())) || (lor.getRest2Startsd().isBefore(lor.getZdt()) && lor.getRest2Endsd().isAfter(lor.getZdt()))) {
                System.out.println("1:" + foods.getFoodNames().get(0) + " -> Price:" + foods.getMcDonaldFoodPrices().get(0));
                System.out.println("2:" + foods.getFoodNames().get(1) + " -> Price:" + foods.getMcDonaldFoodPrices().get(1));
                System.out.println("3:" + foods.getFoodNames().get(2) + " -> Price:" + foods.getMcDonaldFoodPrices().get(2));
                int myfood = scanner.nextInt();
                System.out.println("You bought " + foods.getFoodNames().get(myfood - 1) + ". Your order has been registered.");
            }
        }
        if (input == 3) {
            if ((lor.getRest3Startfd().isBefore(lor.getZdt()) && lor.getRest3Endfd().isAfter(lor.getZdt())) || (lor.getRest3Endsd().isBefore(lor.getZdt()) && lor.getRest3Endsd().isAfter(lor.getZdt()))) {
                System.out.println("1:" + foods.getFoodNames().get(0) + " -> Price:" + foods.getAtawichFoodPrices().get(0));
                System.out.println("2:" + foods.getFoodNames().get(1) + " -> Price:" + foods.getAtawichFoodPrices().get(1));
                System.out.println("3+" + foods.getFoodNames().get(2) + " -> Price:" + foods.getAtawichFoodPrices().get(2));
                int myfood = scanner.nextInt();
                System.out.println("You bought " + foods.getFoodNames().get(myfood - 1) + ". Your order has been registered.");

            }
        }
        if (input == 4) {
            if (lor.getRest4Start().isBefore(lor.getZdt()) && lor.getRest4End().isAfter(lor.getZdt())) {
                System.out.println("1:" + foods.getFoodNames().get(0) + " -> Price:" + foods.getFerikasifFoodPrices().get(0));
                System.out.println("2:" + foods.getFoodNames().get(3) + " -> Price:" + foods.getFerikasifFoodPrices().get(3));
                int myfood = scanner.nextInt();
                if (myfood == 1) {
                    System.out.println("You bought" + foods.getFoodNames().get(0) + ". Your order has been registered.");
                }
                if (myfood == 2) {
                    System.out.println("You bought" + foods.getFoodNames().get(3) + ". Your order has been registered.");
                }
            }
        }
    }

    public void showRestaurantInformation(int vurudi) {
        switch (vurudi) {
            case 1: {
                System.out.println("Name:" + lor.getRestaurants().get(0).getNameOfRestaurant());
                System.out.println("Restaurant Score:" + lor.getRestaurants().get(0).getRestaurantScore());
                System.out.println("Address:" + lor.getRestaurants().get(0).getAddress());
                System.out.println("Price type:" + "Name:" + lor.getRestaurants().get(0).getPriceType());
                break;
            }
            case 2: {
                System.out.println("Name:" + lor.getRestaurants().get(1).getNameOfRestaurant());
                System.out.println("Restaurant score:" + lor.getRestaurants().get(1).getRestaurantScore());
                System.out.println("Address:" + lor.getRestaurants().get(1).getAddress());
                System.out.println("Price type:" + lor.getRestaurants().get(1).getPriceType());
                break;
            }
            case 3: {
                System.out.println("Name:" + lor.getRestaurants().get(2).getNameOfRestaurant());
                System.out.println("Restaurant score:" + lor.getRestaurants().get(2).getRestaurantScore());
                System.out.println("Address:" + lor.getRestaurants().get(2).getAddress());
                System.out.println("Price type:" + lor.getRestaurants().get(2).getPriceType());
                break;
            }
            case 4: {
                System.out.println("Name:" + "Restaurant score:" + lor.getRestaurants().get(3).getNameOfRestaurant());
                System.out.println("Restaurant score:" + lor.getRestaurants().get(3).getRestaurantScore());
                System.out.println("Address:" + lor.getRestaurants().get(3).getAddress());
                System.out.println("Price type:" + lor.getRestaurants().get(3).getPriceType());
                break;
            }
            case 5:
                return;
            default:
                break;
        }
    }
}
