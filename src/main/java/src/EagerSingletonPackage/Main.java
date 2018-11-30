package src.EagerSingletonPackage;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Test());
        Another another = injector.getInstance(Another.class);
        another.print();
    }
}
