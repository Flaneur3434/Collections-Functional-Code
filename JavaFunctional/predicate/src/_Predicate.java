import java.util.function.Function;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String agrs[]){
        System.out.println(isPhoneNumberValid("707-321-4098"));
        System.out.println(isPhoneNumberValid("606-321-4098"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber7).test("606-321-4098"));
        //and
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber7).test("707-321-4098"));
        //or
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber7).test("606-321-4097"));

        //You can also have BiPredicate
    }

    private static boolean isPhoneNumberValid (String phoneNumber){
        return phoneNumber.startsWith("707") && phoneNumber.length() == 12;
    }

    //A predicate represents a boolean valued function that takes only one argument
    //You dont need the {}
    private static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("707") && phoneNumber.length() == 12;

    //You can connect Predicates together
    private static Predicate<String> containsNumber7 = phoneNumber ->
            phoneNumber.contains("7");
}
