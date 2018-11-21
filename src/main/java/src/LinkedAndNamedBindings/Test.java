package src.LinkedAndNamedBindings;


import com.google.inject.BindingAnnotation;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@BindingAnnotation
@Target({FIELD, PARAMETER, METHOD})
@Retention(RUNTIME)
@interface CustomAnnotation1 {}

@BindingAnnotation
@Target({FIELD, PARAMETER, METHOD})
@Retention(RUNTIME)
@interface CustomAnnotation2 {}

public class Test {
    public static void main(String[] args) {
       Injector injector = Guice.createInjector(new BinderModule());
       Utility utility = injector.getInstance(Utility.class);
       utility.callMethod();
       System.out.println("Testing Again");
    }
}
