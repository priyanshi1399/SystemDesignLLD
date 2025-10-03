package BuilderDesignPattern;

public class Client {

    public static void main(String[] args) {

        Director d1=new Director(new EngineerStudentBuilder());
        Director d2=new Director(new MBAStudentBuilder());

        Student engineerStudent=d1.createStudent();
        Student mbaStudent=d2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}
