package com.intern.bangalore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.intern.bangalore.model.Employee;
// import com.intern.bangalore.model.WorkWith;
import com.intern.bangalore.model.ReqDel;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

    @Query("select e from Employee e where e.empId = :d ")
    public Employee findEmployeeById(@Param("d") int id);

    // @Query("select w from works_with w where w.client_id =: select c from client c where c.client_name = : n ")
    // public WorkWith findWithName(@Param("n") String name);
    
    // @Query("select w from works_with w where w.client_id =: n")
    // public WorkWith findWithId(@Param("n") int name);

    @Query(nativeQuery = true)
    public List<ReqDel> findDetailsByName(String cname);

}
