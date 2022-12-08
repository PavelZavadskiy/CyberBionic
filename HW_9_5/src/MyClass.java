public class MyClass {
    static public <T> T factoryMethod(T in) {
        System.out.printf("1: %s\n", in.getClass());
        //return (T) new Object();
        T elem = (T) new Object();
        System.out.printf("2: %s\n", elem.getClass());
        return elem;
    }
}
