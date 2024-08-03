import java.util.Arrays;
import java.util.Optional;

public class ArraySearch {
    public static <T> T findElement(T[] array, T element) {
        Optional<T> result = Arrays.stream(array)
                .filter(e -> e.equals(element))
                .findFirst();
        return result.orElse(null);
    }

    public static <T> int findElementIndex(T[] array, T element) {
        return Arrays.stream(array)
                .filter(e -> e.equals(element))
                .findFirst()
                .map(e -> Arrays.asList(array).indexOf(e))
                .orElse(-1);
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"apple", "banana", "cherry"};

        System.out.println("Element found: " + findElement(intArray, 3)); // 3
        System.out.println("Element found: " + findElement(strArray, "banana")); // banana
        System.out.println("Element found: " + findElement(strArray, "grape")); // null

        System.out.println("Element index: " + findElementIndex(intArray, 3)); // 2
        System.out.println("Element index: " + findElementIndex(strArray, "banana")); // 1
        System.out.println("Element index: " + findElementIndex(strArray, "grape")); // -1
    }
}