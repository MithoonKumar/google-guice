package src.Provider;

import com.google.inject.AbstractModule;

public class ModuleBinder extends AbstractModule {

    @Override
    protected void configure(){
        bind(TestInterface.class).toProvider(ValueBinder.class);
        //bind(TestInterface.class).to(TestInterfaceImpl1.class);
    }
}
