package src.EagerSingletonPackage;

import com.google.inject.Inject;

public class Another {
    private First first;

    @Inject
    public Another(First first){
        this.first = first;
    }

    public void print() {
        System.out.println(first.getFirstName());
    }
}
