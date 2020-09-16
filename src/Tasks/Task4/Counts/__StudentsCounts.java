package Tasks.Task4.Counts;

import Models.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class __StudentsCounts {
    public long getCountByFaculty(List<Student> students,String facultyName){
        Stream<Student> stream =  students.stream();

        long count =  stream
                .filter(x-> x.getFaculty()==facultyName)
                .count();

        return  count;
    }

}
