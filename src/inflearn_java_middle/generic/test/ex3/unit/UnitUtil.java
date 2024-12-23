package inflearn_java_middle.generic.test.ex3.unit;

public class UnitUtil {
    public static <T extends BioUnit> T maxHp(T t1, T t2) {
        if (t1.getHp() != t2.getHp()) {
            return t1.getHp() > t2.getHp() ? t1 : t2;
        } else {
            return t1;
        }

    }
}