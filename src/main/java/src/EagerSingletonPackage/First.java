package src.EagerSingletonPackage;


@customEagerSingletonAnnotation
public class First {
    private String firstName;

    public First() {
        this.firstName = "are bhai";
    }

    public String getFirstName() {
        return firstName;
    }
}
