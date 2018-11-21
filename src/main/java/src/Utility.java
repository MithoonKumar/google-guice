package src;

import com.google.inject.Inject;

public class Utility {
    private TestInterface testInterface1;

    @Inject
    public Utility(@CustomAnnotation2 TestInterface testInterface2) {
        this.testInterface1 = testInterface2;
    }

    public void callMethod() {
        testInterface1.print();
    }
}
