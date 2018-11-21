package src.ConstantBindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Binder());
        Utility utility = injector.getInstance(Utility.class);
        System.out.println(utility.method());
    }
}
