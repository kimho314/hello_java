package generics.ex4;

public class UnitUtilTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("marine1", 40);
        Marine m2 = new Marine("marine2", 50);
        Marine resultMaine = UnitUtil.maxHp(m1, m2);
        System.out.println("resultMarine = " + resultMaine);

        Zealot z1 = new Zealot("zealot1", 100);
        Zealot z2 = new Zealot("zealot2", 150);
        Zealot resultZealot = UnitUtil.maxHp(z1, z2);
        System.out.println("resultZealot = " + resultZealot);
    }
}
