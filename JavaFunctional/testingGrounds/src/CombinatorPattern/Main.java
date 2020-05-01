package CombinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice53XY@gmail.com",
                "808-654-8762",
                LocalDate.of(2000, 1, 1)
        );

        //Using Cominbator Pattern
        CustomerRegistrationValidator.ValidationResult result =
                CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAnAdult())
                .apply(customer);


        System.out.println(result);
    }
}
