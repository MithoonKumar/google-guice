package src.ConstructorBindings;

import com.google.inject.name.Named;

public class TestInterfaceImpl implements TestInterface {
    private String str;

    public TestInterfaceImpl() {
    }

    public TestInterfaceImpl(@Named("url") String str) {
        this.str = str;
    }

    public void print() {
        System.out.println(this.str);
    }
}
