package src;


import com.google.inject.AbstractModule;

public class BinderModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TestInterface.class).annotatedWith(CustomAnnotation1.class).to(SubClasstTestInterfaceImpl1.class);
        bind(TestInterface.class).annotatedWith(CustomAnnotation2.class).to(SubClasstTestInterfaceImpl2.class);
    }
}

