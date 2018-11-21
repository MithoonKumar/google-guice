package src.ProvidesAnnotation;

import com.google.inject.Inject;

public class Utility {
    private TestInterface testInterface;

    @Inject
    public Utility(TestInterface testInterface1) {
        this.testInterface = testInterface1;
    }

    public void callMethod() {
        this.testInterface.printSomething();
    }
}
