package this_is_java.ch07.sec03.exam01;

public class SmartPhone extends Phone{
    public SmartPhone(String model, String color) {
        super();
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone 생성자 실행");
    }
}