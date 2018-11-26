package src.ProvidedByAnnotation;


import com.google.inject.Provider;

public class ValueBinder implements Provider<TestInterface> {

    public TestInterface get() {
        return new TestInterfaceImpl2();
    }
}
