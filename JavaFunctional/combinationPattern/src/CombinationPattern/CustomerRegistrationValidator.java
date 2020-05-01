package CombinationPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistrationValidator  extends Function <Customer, CustomerRegistrationValidator.ValidationResult> {

    static CustomerRegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@gmail.com") ?
                ValidationResult.SUCCESS : ValidationResult.EMAIL_IS_NOT_VALID;

    }

    static CustomerRegistrationValidator isPhoneNumberValid(){
        return customer -> customer.getPhoneNumber().length() == 12 ?
                ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAnAdult(){
        return customer -> Period.between(customer.getdob(), LocalDate.now()).getYears() > 16 ?
        ValidationResult.SUCCESS : ValidationResult.IS_NOT_AN_ADULT;

    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other){
        return customer -> {
            ValidationResult result  = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS, PHONE_NUMBER_NOT_VALID, EMAIL_IS_NOT_VALID, IS_NOT_AN_ADULT
    }
}

