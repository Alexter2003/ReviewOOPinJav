package class_example;

public class Person {
     private String name;
     private String lastName;

     public Person(String name, String lastName) {
          this.name = name;
          this.lastName = lastName;
     }

     public Person(){}

     //GETTERS
     public String getName() {
          return name;
     }
     public String getLastName() {
          return lastName;
     }

     //SETTERS
     public void setName(String name) {
          this.name = name;
     }
     public void setLastName(String lastName) {
          this.lastName = lastName;
     }
}
