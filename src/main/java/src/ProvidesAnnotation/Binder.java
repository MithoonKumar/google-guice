package src.ProvidesAnnotation;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class  Binder extends AbstractModule {
    @Override
    protected void configure(){}

    @Provides
    public TestInterface getsss() {
        String dbUrl = "ye url hai";
        int num = 100;
        TestInterface testInterface =  new TestInterfaceImpl(dbUrl, num);
        return testInterface;
    }

}

