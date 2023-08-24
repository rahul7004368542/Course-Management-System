package com.SpringREST.SpringREST.Repository;

import com.SpringREST.SpringREST.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

// jpa repo -> entity and type datatype of primary key in that entity
public interface CourseRepository extends JpaRepository<Course, Long> {

}
