package src.Provider;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ModuleBinder());
        Utility utility = injector.getInstance(Utility.class);
        utility.doSomething();
    }
}
