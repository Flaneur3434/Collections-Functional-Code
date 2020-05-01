import java.util.function.Consumer;

public class _Consumer {
    public static void main(String args[]){
        greetCustomer(new Customer("Kendall", "707-321-4098"));


        Customer Kendall = new Customer("Kendall", "707-321-4098");
        greetCustomerConsumer.accept(Kendall);

    }

    private static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", is your number: " + customer.customerPhoneNumber + "?");
    }

    //Consumer takes in one input and doesn't return anything
    private static Consumer<Customer> greetCustomerConsumer = customer -> {
        System.out.println("Hello " + customer.customerName + ", is your number: " + customer.customerPhoneNumber + "?");
    };

    private static Consumer<String> throwAwayConsumer = x ->{
        System.out.println(x+1);
    };

    private static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
