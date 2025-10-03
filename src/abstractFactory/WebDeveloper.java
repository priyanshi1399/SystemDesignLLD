package abstractFactory;

import abstractFactory.Employee;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        return 0;
    }

    @Override
    public String name(){
        System.out.println("I am a Web Developer");
        return "WebDeveloper";
    }
}
