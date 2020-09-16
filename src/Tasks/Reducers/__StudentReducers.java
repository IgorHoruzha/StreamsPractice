package Tasks.Reducers;

import Models.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class __StudentReducers {
    public List<String> filteredByGroupAndMapInitials(List<Student> students, String group){

        Stream<Student> stream =  students.stream();

        List<String>  filteredStudents = stream
                .filter(x-> x.getGroup()==group)
                .map(x->         x.getFirstName()+ " " + x.getLastName()+" " + x.getPatronymic())
                .collect(Collectors.toList());


        return  filteredStudents;
    }


    public String reduceToInitialsFacultyAndGroup(List<Student> students,int count){
        Stream<Student> stream =  students.stream();

        String  filteredStudents = stream
.limit(count)
                .reduce("" ,(y,x)->
                   {
                        String s = y + x.getFirstName()
                               + " " + x.getLastName()
                               + " " + x.getPatronymic()
                               + " " + x.getFaculty()
                               + " " + x.getGroup()+System.getProperty("line.separator");
                       return s;
                   },  (x, y)->x+y );

        return  filteredStudents;
    }
}
