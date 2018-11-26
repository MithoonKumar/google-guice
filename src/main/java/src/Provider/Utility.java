package src.Provider;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class Utility {

    //private Provider<TestInterface> testInterface;
    private TestInterface testInterface;

//    @Inject
//    public Utility(Provider<TestInterface> testInterface) {
//        this.testInterface = testInterface;
//    }

    @Inject
    public Utility(TestInterface testInterface) {
        this.testInterface = testInterface;
    }

    public void doSomething() {
        int val = testInterface.someVal();
        System.out.println("Printing the value" + val);
    }
}
