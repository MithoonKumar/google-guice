package src.Provider;

import com.google.inject.Provider;

public class ValueBinder implements Provider<TestInterface> {

    public TestInterface get() {
        //Here we can implement our custom logic to return any implementation
        return new TestInterfaceImpl2();
    }
}
