package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String ags[]){
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getList.get());
    }

    private static String getDBConnectionUrl () {
        return "www.redtube:5432/users";
    }
    //A supplier just returns a value with no inputs
    private static Supplier<String> getDBConnectionUrlSupplier = () ->
            "www.redtube:5432/users";

    //You can return cooler objects
    private static Supplier<List<String>> getList = () ->
            List.of(
                    "www.redtube:5432/users",
                    "www.youtube.com");
}
