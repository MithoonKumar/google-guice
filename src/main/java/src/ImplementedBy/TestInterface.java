package src.ImplementedBy;

import com.google.inject.ImplementedBy;

@ImplementedBy(TestInterfaceImpl.class) // The @ImplementedBy has less priority as compared to the Guice module binding in the binder class.
public interface TestInterface {
    void print();
}
