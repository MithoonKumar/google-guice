package src.ProvidedByAnnotation;

import com.google.inject.Inject;

public class Utility {
    private TestInterface testInterface;

    @Inject
    public Utility(TestInterface testInterface) {
        this.testInterface = testInterface;
    }

    public void doSomething() {
        int k = this.testInterface.someVal();
        System.out.println(k);
    }
}
