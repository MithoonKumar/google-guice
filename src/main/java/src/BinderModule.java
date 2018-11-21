package src;


import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class BinderModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TestInterface.class).annotatedWith(Names.named("firstImpl")).to(SubClasstTestInterfaceImpl1.class);
        bind(TestInterface.class).annotatedWith(Names.named("secondImpl")).to(SubClasstTestInterfaceImpl2.class);
    }
}

