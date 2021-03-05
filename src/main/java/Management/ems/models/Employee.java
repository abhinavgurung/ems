package Management.ems.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long EmployeeId;

    @Column(name = "firstName")
    private String firstName;


    private String lastName;

    @NotNull
    @Min(value= 18, message =" age should be above 18")
    @Column(name="age")
    private int age;

    @Column(name="salary")
    private double salary;
}
