package jp.co.axa.apidemo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	 public Employee() {
		 
	    }
	
	  public Employee(String department,String name, Integer salary) {
		  this.department = department;
		  this.name = name;
		  this.salary = salary;
      }
	  
	@Getter
    @Setter
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name="EMPLOYEE_NAME")
    private String name;

    @Getter
    @Setter
    @Column(name="EMPLOYEE_SALARY")
    private Integer salary;

    @Getter
    @Setter
    @Column(name="DEPARTMENT")
    private String department;
    
    
    public Long getId() {
     return this.id;
    }

    public String getName() {
     return this.name;
    }

    public Integer getSalary() {
     return this.salary;
    }
  
    public String getDepartment() {
     return this.department;
    }

    public void setId(Long id) {
     this.id = id;
    }

    public void setName(String name) {
     this.name = name;
    }

    public void setSalary(Integer salary) {
     this.salary = salary;
    }
  
    public void setDepartment(String department) {
      this.department = department;
    }

}
