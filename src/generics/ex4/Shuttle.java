package generics.ex4;

import java.util.ArrayList;
import java.util.List;

public class Shuttle<T extends BioUnit> {
    private List<T> units;

    public Shuttle() {
        this(new ArrayList<>());
    }

    public Shuttle(List<T> units) {
        this.units = units;
    }

    public void in(T unit) {
        this.units.add(unit);
    }

    public void showInfo() {
        this.units.forEach(it -> System.out.println("이름: " + it.getName() + ", HP: " + it.getHp()));
    }
}
