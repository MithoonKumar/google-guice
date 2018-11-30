package src.AnnotationPackage;

/**
 * This class implements something which only I want and nobody else wants. How can someone control while defining a class
 */

@CustomAnnotation
public class MyCustomClass {
    private String life;
    private String Work;
    private String status;

    /**
     *This is the constructor. Fill the value of your life , work and status (single, committed, married)
     */
    public MyCustomClass(String life, String work, String status) {
        this.life = life;
        Work = work;
        this.status = status;
    }
}
