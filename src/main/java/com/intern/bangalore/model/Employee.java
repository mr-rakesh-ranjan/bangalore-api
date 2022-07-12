package com.intern.bangalore.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

@SqlResultSetMapping(name = "Mapping.ReqDel",
    classes = @ConstructorResult(targetClass = ReqDel.class,
        columns = {
            @ColumnResult(name = "fName"),
            @ColumnResult(name = "lName"),
            @ColumnResult(name = "sex"),
            @ColumnResult(name = "cName"),
            @ColumnResult(name = "tSale")
        }
    )
)

@NamedNativeQuery(
    name="Employee.findDetailsByName",
    query="SELECT e.first_name as fName, e.last_name as lName, e.sex as sex, c.client_name as cName, w.total_sales as tSale from employee e inner join works_with w on w.emp_id = e.emp_id inner join client c on c.client_id = w.client_id WHERE e.sex = 'M' AND c.client_name = :cname",
    resultSetMapping = "Mapping.ReqDel"
)

@Entity
public class Employee {
    
    @Id
    // @OneToOne
    private int empId;
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date birthDay;
    private String sex;
    private int salary;

    @OneToMany(mappedBy = "employee")
    private Collection<WorkWith> sale = new ArrayList<>();

    public Employee(int empId, String firstName, String lastName, Date birthDay, String sex, int salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.sex = sex;
        this.salary = salary;
    }

    public Employee() {
        super();
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [birthDay=" + birthDay + ", empId=" + empId + ", firstName=" + firstName + ", lastName="
                + lastName + ", salary=" + salary + ", sex=" + sex + "]";
    }

    

    

}
