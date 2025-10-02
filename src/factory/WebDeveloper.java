package factory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("The salary of WebDeveloper is: " );
        return 10000;
    }
}
