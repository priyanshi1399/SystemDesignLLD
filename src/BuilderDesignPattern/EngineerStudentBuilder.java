package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{


    @Override
    public StudentBuilder setSubjects() {
       List<String> subs=new ArrayList<>();
       subs.add("DSA");
       subs.add("OS");
       subs.add("COA");
       this.subjects=subs;
       return this;

    }
}
