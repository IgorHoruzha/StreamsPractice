package Tasks.Task3;

import Models.Student;
import Tasks.Task3.Filters.__StudentsFilters;
import Tools.__Tools;

import java.util.List;

public class Task_3_Executor {

    public  static void Start(List<Student> students ){

        System.out.println( "=================Task 3=================");
        __StudentsFilters task03Collect= new __StudentsFilters();
        System.out.println( "-----------------Part 1-----------------");
        List<Student> filteredByFacultyStudents=  task03Collect.filterByFaculty(students,"Faculty4");
        __Tools.ListShow(filteredByFacultyStudents);
        System.out.println( "-----------------Part 2-----------------");
        List<Student> filteredByFacultyThenByCourseStudents=  task03Collect.filterByFacultyTenByCourse(students,"Faculty4","Course3");
        __Tools.ListShow(filteredByFacultyThenByCourseStudents);
        System.out.println( "-----------------Part 3-----------------");
        List<Student> filteredByBurnAfterYearStudents=  task03Collect.filterByBurnAfterYear(students,1994);
        __Tools.ListShow(filteredByBurnAfterYearStudents);
        System.out.println( "-----------------Part 4-----------------");
        List<String> filteredByGroupAndMapInitialsStudents=  task03Collect.filteredByGroupAndMapInitials(students,"Group4");
        __Tools.ListShow(filteredByGroupAndMapInitialsStudents);

    }

}
