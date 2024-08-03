public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        GenericClass<Integer> intObj = new GenericClass<>(123);
        intObj.printValue();

        GenericClass<String> stringObj = new GenericClass<>("Hello");
        stringObj.printValue();
    }
}