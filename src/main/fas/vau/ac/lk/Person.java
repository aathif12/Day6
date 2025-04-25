package fas.vau.ac.lk;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
       private String email;
       private String gender;
       private String name;
       private int phone;
       
}
