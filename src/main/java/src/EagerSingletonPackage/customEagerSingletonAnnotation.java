package src.EagerSingletonPackage;


import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface customEagerSingletonAnnotation {
}
