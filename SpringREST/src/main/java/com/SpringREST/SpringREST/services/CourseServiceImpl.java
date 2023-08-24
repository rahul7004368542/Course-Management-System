package com.SpringREST.SpringREST.services;

import com.SpringREST.SpringREST.Repository.CourseRepository;
import com.SpringREST.SpringREST.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

//    List<Course> list;
    @Autowired
    private CourseRepository courseRepository;

    public CourseServiceImpl() {
//        list = new ArrayList<>();
//        list.add(new Course(145,"java course","this course is java"));
//        list.add(new Course(4343,"spring boot course","this course is spring boot"));
   }

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
//        return list;
    }


    @Override
    public Course getCourse(long courseId) {
        Course courseEntity = courseRepository.getOne(courseId);
        Course course = new Course();
        course.setId(courseEntity.getId());
        course.setTitle(courseEntity.getTitle());
        course.setDescription(courseEntity.getDescription());
        return course;
    }


    @Override
    public Course addCourse(Course course) {
//        list.add(course);
//        return course;
        courseRepository.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        list.forEach(e->{
//            if(e.getId()==course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
//        return course;
        courseRepository.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
//        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
        Course entity = courseRepository.getOne(parseLong);
        courseRepository.delete(entity);
    }
}
