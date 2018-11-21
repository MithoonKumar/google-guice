package src;


import com.google.inject.AbstractModule;

public class BinderModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TestInterface.class).to(TestInterfaceImpl.class);
    }
}

