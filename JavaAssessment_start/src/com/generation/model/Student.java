package com.generation.model;

import java.util.*;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;
    private final List<Course>courses = new ArrayList<>();
    private Map<String,Course> enrolledCourses;


    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
        this.enrolledCourses = new HashMap<>();
    }

    public void enrollToCourse( Course course )
    {
        //TODO (4.2)
        courses.add(course);
        getEnrolledCourses(course);
    }
    public void getEnrolledCourses( Course course )
    {
        enrolledCourses.put( course.getCode(), course );
    }
    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        if (getEnrolledCourses().isEmpty())
        {
            return null;
        }
        else
        {
            List<Course> passedCourses = new ArrayList<>();
            for (Course course:getEnrolledCourses())
            {
                if (course.getGrade() >= PASS_MIN_GRADE)
                {
                    passedCourses.add(course);
                }
            }
            return passedCourses;
        }
    }

    public Course findCourseById( String courseId )
    {
        //TODO 3.1
        if (getEnrolledCourses().isEmpty())
        {
            return null;
        }
        else {
            for(Course course:getEnrolledCourses())
            {
                if (course.getId().equals(courseId))
                {
                    return course;
                }
            }
        }
       return null;
    }


    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO (5.2)
        List<Course> courses=new ArrayList<>();
        for(Course course : enrolledCourses.values()){
            courses.add(course);
        }
        return null;
    }

    @Override
    public String toString()
    {
        String courseNames = "";
        for (Course key : enrolledCourses.values())
        {
            courseNames += key + "\n";
        }

        return "Student {" + super.toString() + "}" + "\n" + "Enrolled Courses:" + "\n" + courseNames;

    }



}
