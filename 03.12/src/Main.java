import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /**
         * private
         * protected
         * default = package private
         * public
         */

        // Промежуточные и терминальные
        Stream.of("a", "b", "c")

                .forEach(System.out::println);
    }

    /*default*/ static void test(){

    }

    static {
        System.out.println("static block");
    }

    static int a;

}