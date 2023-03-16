package combinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "@peter.com",
                "+9094048475737",
                LocalDate.of(2000,5,6)

        );

        System.out.println(new CustomerValidatorServices().isValid(customer));

//        USING THE COMBINATOR
        CustomerRegistrationValidator.ValidationResult result =  CustomerRegistrationValidator.isAnAdult()
                .and(CustomerRegistrationValidator.isEmailValid())
                .and(CustomerRegistrationValidator.isPhoneNumberValid()).apply(customer);

        System.out.println(result);
        if(result!= CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
            
        }
    }
}
