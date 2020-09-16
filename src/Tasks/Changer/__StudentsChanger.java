package Tasks.Changer;

import Models.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class __StudentsChanger {

    public List<Student> changeStudentsFaculty(List<Student> students, String newFaculty) {
        Stream<Student> stream = students.stream();

        List<Student> studentsInNewFaculty = stream.map(x -> new Student(
                x.getId(),
                x.getFirstName(),
                x.getLastName(),
                x.getPatronymic(),
                x.getYearOfBirth(),
                x.getAddress(),
                x.getTelephone(),
                newFaculty,
                x.getCourse(),
                x.getGroup()))
                .collect(Collectors.toList());

        return studentsInNewFaculty;
    }

    public List<Student> changeStudentsGroup(List<Student> students, String newGroup) {
        Stream<Student> stream = students.stream();

        List<Student> studentsInNewFaculty = stream.map(x -> new Student(
                x.getId(),
                x.getFirstName(),
                x.getLastName(),
                x.getPatronymic(),
                x.getYearOfBirth(),
                x.getAddress(),
                x.getTelephone(),
                x.getFaculty(),
                x.getCourse(),
                newGroup))
                .collect(Collectors.toList());

        return studentsInNewFaculty;
    }

}


