package src.ImplementedBy;

import com.google.inject.ImplementedBy;

@ImplementedBy(TestInterfaceImpl.class)
public interface TestInterface {
    void print();
}
