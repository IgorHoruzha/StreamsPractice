package Tools;

import Models.Student;

import java.util.List;

public class __Tools {

    public static   <T>  void  ListShow(List<T> students){

        for(int i=0;i<students.size();i++){
            T currentStudent= students.get(i);
            System.out.println( currentStudent.toString());
        }
    }
}
