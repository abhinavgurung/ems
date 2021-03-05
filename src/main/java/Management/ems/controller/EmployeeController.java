package Management.ems.controller;


import Management.ems.models.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeeController {

    @GetMapping("/employees")
    public ResponseEntity<Employee> getAllEmployees(){
        Employee e = new Employee();
        e.setAge(15);
        e.setFirstName("abhinav");
        e.setLastName("gurung");

        return new ResponseEntity<Employee>(e, HttpStatus.OK);

    }
}
