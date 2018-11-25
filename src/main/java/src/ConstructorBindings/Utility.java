package src.ConstructorBindings;

import com.google.inject.Inject;

public class Utility {
    private TestInterface testInterface;


    @Inject
    public Utility(TestInterface testInterface) {
        this.testInterface = testInterface;
    }

    public void someMethod() {
        testInterface.print();
    }
}
