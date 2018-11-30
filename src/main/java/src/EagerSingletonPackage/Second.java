package src.EagerSingletonPackage;

@customEagerSingletonAnnotation
public class Second {
    private String secondName;

    public Second() {
        this.secondName = "hello";
    }

    public String getSecondName() {
        return secondName;
    }
}
