package lesson_23;

import java.util.Objects;

public class SimpleBox {

    private Objects value;

    public SimpleBox(Objects value) {
        this.value = value;
    }

    public void setValue(Objects value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SimpleBox{" +
                "value=" + value +
                '}';
    }
}
