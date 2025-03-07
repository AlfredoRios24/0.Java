
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class ExamplePredicate {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "", "Bob", "Charlie", null, "David");

        Predicate<String> isNotEmpty = s -> s != null && !s.isEmpty();
        Predicate<String> startsWithA = s -> s != null && s.startsWith("A");

        System.out.println("\n=== Names that are not empty ===");
        names.stream()
             .filter(isNotEmpty)
             .forEach(System.out::println); // Imprime: Anna, Bob, Charlie, David

        System.out.println("\n=== Names that start with A and are not empty ===");
        names.stream()
             .filter(isNotEmpty.and(startsWithA))
             .forEach(System.out::println); // Imprime: Anna

        System.out.println("\n=== Names that are either null or empty ===");
        names.stream()
             .filter(isNotEmpty.negate())
             .forEach(System.out::println); // Imprime: , null
    }
}
