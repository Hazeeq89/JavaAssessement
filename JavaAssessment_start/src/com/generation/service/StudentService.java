package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Evaluation;
import com.generation.model.Student;

import java.util.*;

public class StudentService

{
    private final Map<String, Student> students = new HashMap<>();
    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }


    public Student findStudent( String studentId )
    {
        //TODO (2.1) done
        if (students.containsKey( studentId ))
        {
            return students.get( studentId );
        }
        return null;
    }
    public void enrollToCourse( String studentId, Course course )
    {
        //TODO (4.1) done
        if ( students.containsKey( studentId ))
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }
    public boolean showSummary()
    {

        //TODO (5.1) done
        for(Student student:students.values()) System.out.println(student.toString());
        return false;
    }




}
