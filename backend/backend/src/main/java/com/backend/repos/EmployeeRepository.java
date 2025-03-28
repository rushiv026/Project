package com.backend.repos;
import com.backend.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Emp,Long>{
}
