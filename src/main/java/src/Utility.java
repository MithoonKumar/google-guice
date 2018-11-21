package src;

import com.google.inject.Inject;
import com.google.inject.name.Named;


public class Utility {
    private TestInterface testInterface1;

    @Inject
    public Utility(@Named("secondImpl") TestInterface testInterface2) {
        this.testInterface1 = testInterface2;
    }

    public void callMethod() {
        testInterface1.print();
    }
}
