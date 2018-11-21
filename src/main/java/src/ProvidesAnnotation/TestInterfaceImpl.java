package src.ProvidesAnnotation;

import com.google.inject.Inject;

public class TestInterfaceImpl implements TestInterface{
    private String str;
    private int num;

    public TestInterfaceImpl(String str1, int num1) {
        this.str = str1;
        this.num = num1;
    }

    public void printSomething(){
        System.out.println("Printing the injected object property");
        System.out.println("string is " + this.str + "integer is " + this.num);
    }

}
