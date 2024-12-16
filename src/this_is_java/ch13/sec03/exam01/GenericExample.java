package this_is_java.ch13.sec03.exam01;

public class GenericExample {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int IntValue = box1.get();
        System.out.println(IntValue);

        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println("strValue = " + strValue);
    }
}
