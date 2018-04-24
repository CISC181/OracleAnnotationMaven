package MainPackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;
import org.hibernate.annotations.Tables;
 
 

@Entity
@Table(name = "EMP")
public class Employee implements java.io.Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMP")
	@SequenceGenerator(name = "SEQ_EMP", sequenceName = "SEQ_EMP", allocationSize = 1)
	@Column(name = "id")
	private int id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "SALARY")
	private int salary;

	// FAKE_ATTRIBUTE is a attribute of the class... but will be ignored by hibernate.
	@Transient
	private String FAKE_ATTRIBUTE;
	
	public Employee() {
	}

	public Employee(String fname, String lname, int salary) {
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last_name) {
		this.lastName = last_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
