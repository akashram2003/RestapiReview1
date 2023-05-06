package in.akash.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.akash.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
