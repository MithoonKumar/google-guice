package src.ProvidedByAnnotation;

import com.google.inject.ProvidedBy;

@ProvidedBy(ValueBinder.class)
public interface TestInterface {
    public int someVal();
}
