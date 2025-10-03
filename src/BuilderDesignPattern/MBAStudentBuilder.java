package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs=new ArrayList<>();
        subs.add("Micro Economics");
        subs.add("Finance");
        subs.add("Accounts");
        this.subjects=subs;
        return this;
    }
}
