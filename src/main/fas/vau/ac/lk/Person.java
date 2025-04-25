package fas.vau.ac.lk;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
       private String email;
       private String gender;
       private String name;
       private int phone;
       public String getEmail() {
              return email;
       }
       public void setEmail(String email) {
              this.email = email;
       }
       public String getGender() {
              return gender;
       }
       public void setGender(String gender) {
              this.gender = gender;
       }
       public String getName() {
              return name;
       }
       public void setName(String name) {
              this.name = name;
       }
       public int getPhone() {
              return phone;
       }
       public void setPhone(int phone) {
              this.phone = phone;
       }
       
}
