package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String args[]){
        greetCustomer(new Customer("Kendall", "707-321-4098"));


        Customer Kendall = new Customer("Kendall", "707-321-4098");
        greetCustomerConsumer.accept(Kendall);

        greetCustomerBiConsumer.accept(Kendall, true);
        greetCustomerBiConsumer.accept(Kendall, false);

    }

    private static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", is your number: " + customer.customerPhoneNumber + "?");
    }

    //Consumer takes in one input and doesn't return anything
    private static Consumer<Customer> greetCustomerConsumer = customer -> {
        System.out.println("Hello " + customer.customerName + ", is your number: " + customer.customerPhoneNumber + "?");
    };

    //BiConsumer takes in two inputs and doesn't return anything
    //Dont forget the paranthesis for your two arguments
    private static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->{
        System.out.println("Hello " + customer.customerName + ", is your number: " + (showPhoneNumber ? customer.customerPhoneNumber + "?" : "***-***-***"));
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
