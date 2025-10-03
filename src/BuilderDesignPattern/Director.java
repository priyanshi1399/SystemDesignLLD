package BuilderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineerStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof  MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent(){
        return studentBuilder.setRollNumber(1).setAge(22).setName("Priyanshi").setSubjects().build();
    }

    private Student createMBAStudent(){
        return studentBuilder.setRollNumber(2).setAge(25).setName("Heeram").setFatherName("Ajay").setMotherName("Kalpana").setSubjects().build();
    }

}
