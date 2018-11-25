package src.ConstructorBindings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class Binder extends AbstractModule {

    @Override
    protected void configure() {
        try {
            bind(TestInterface.class).toConstructor(TestInterfaceImpl.class.getConstructor(String.class));
        } catch (NoSuchMethodException e) {
            System.out.println("Required constructor missing");
            e.printStackTrace();
        }
        bind(String.class).annotatedWith(Names.named("url")).toInstance("this is an injected url");
    }
}
