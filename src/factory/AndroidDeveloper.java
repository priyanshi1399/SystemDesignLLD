package factory;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("The salary of AndroidDeveloper is : ");
        return 5000;
    }
}
