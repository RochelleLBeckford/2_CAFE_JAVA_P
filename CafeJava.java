/**
 * CafeJava
 */
public class CafeJava {

    public static void main(String[] args) {
        // app variables
        // lines of text will appear in the app/
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is ready.";
        String displayTotalMessage = " Your total us $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        // double dripCoffee = 4.75;
        double dripCoffee = 6.5;
        // double latte = 5.15;
        double latte = 7.15;
        // double cappuccino = 5.25;
        double cappuccino = 4.25;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        // boolean isReadyOrder2 = true;
        boolean isReadyOrder2 = false;
        // boolean isReadyOrder3 = false;
        boolean isReadyOrder3 = true;
        // boolean isReadyOrder4 = true;
        boolean isReadyOrder4 = false;

        // APP INTERACTION SIMULATION ( add your code for the challenges below)

        //? Ex.
        // System.out.println(generalGreeting + customer1);
        // Output -> "Welcome to Cafe Java, Cindhuri"

        //* Customer print info will go here
        //? Cindy
        // System.out.println(customer1 + pendingMessage + displayTotalMessage + dripCoffee );

        if (isReadyOrder1) {
            System.out.println(generalGreeting + customer1 + ". " + customer1 + readyMessage + displayTotalMessage + dripCoffee);
        }
        else {
            System.out.println(customer1 + pendingMessage + displayTotalMessage + (dripCoffee + mochaPrice));
        }

        //? Noah
        if (isReadyOrder4) {
            System.out.println(generalGreeting + customer4 + ". "+ customer4 + readyMessage + displayTotalMessage + cappuccino);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        //? Sam
        System.out.println(generalGreeting + customer2 + ". " + customer2 + displayTotalMessage + latte*2);

        //? Sam pt 2
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        //? Jimmy
        // System.out.println(generalGreeting + customer3 + ". " + customer3 + readyMessage + displayTotalMessage + (latte - dripCoffee));

        if (isReadyOrder3) {
            System.out.println(generalGreeting + customer3 + ". " + customer3 + readyMessage + displayTotalMessage + (latte - dripCoffee));
        }
        else {
            System.out.println(customer3 + pendingMessage);
        }

    }
}