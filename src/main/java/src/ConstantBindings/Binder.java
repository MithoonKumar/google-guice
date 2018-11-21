package src.ConstantBindings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class Binder extends AbstractModule {
    @Override
    protected void configure () {
        bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhost:5326/emp");
    }
}
