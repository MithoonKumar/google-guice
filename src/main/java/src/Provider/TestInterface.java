package src.Provider;


import com.google.inject.ProvidedBy;

@ProvidedBy(ValueBinder.class)
public interface TestInterface {
    int someVal();
}
