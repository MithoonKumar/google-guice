package src.ImplementedBy;

import com.google.inject.Inject;

public class Utility {
    private TestInterface testInterface;
    @Inject
    public Utility(TestInterface testInterface) {
        this.testInterface = testInterface;
    }

    public void doSomething() {
        this.testInterface.print();
    }
}
