package com.company;

import Models.Student;
import Tasks.Task3.Task_3_Executor;
import Tasks.Task4.Task_4_Executor;
import Tasks.Task5.Task_5_Executor;
import Tasks.Task6.Task_6_Executor;
import Tasks.Task7.Task_7_Executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students =
                Arrays.asList(
                        new Student(1, "FirstName1", "LastName1", "Patronymic1", 1991, "Address1", "Phone1", "Faculty1", "Course1", "Group1"),
                        new Student(2, "FirstName2", "LastName2", "Patronymic2", 1992, "Address2", "Phone2", "Faculty2", "Course2", "Group2"),
                        new Student(3, "FirstName3", "LastName3", "Patronymic3", 1993, "Address3", "Phone3", "Faculty4", "Course3", "Group3"),
                        new Student(4, "FirstName4", "LastName4", "Patronymic4", 1994, "Address4", "Phone4", "Faculty4", "Course4", "Group4"),
                        new Student(5, "FirstName5", "LastName5", "Patronymic5", 1995, "Address5", "Phone5", "Faculty5", "Course5", "Group4"),
                        new Student(6, "FirstName6", "LastName6", "Patronymic6", 1996, "Address6", "Phone6", "Faculty6", "Course6", "Group6")
                );

        Task_3_Executor.Start(students);
        Task_4_Executor.Start(students);
        Task_5_Executor.Start(students);
        Task_6_Executor.Start(students);
        Task_7_Executor.Start(students);
    }


}
