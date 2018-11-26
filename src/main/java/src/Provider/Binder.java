package src.Provider;

import com.google.inject.AbstractModule;

public class Binder extends AbstractModule {
    @Override
    public void configure () {
        bind(TestInterface.class).to(TestInterfaceImpl.class);
    }
}
