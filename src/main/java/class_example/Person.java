package class_example;

public class Person {
     private static int counter = 0;
     private String name;
     private String lastName;
     private final int idPerson;

     public Person(String name, String lastName) {
          this.name = name;
          this.lastName = lastName;
          this.idPerson = ++Person.counter;
     }

     public Person(){
          this.idPerson = ++Person.counter;
     }

     @Override
     public String toString() {
          return "Person{" +
                  "name= '" + name + '\'' +
                  ", lastName= '" + lastName + '\'' +
                  ", idPerson= " + idPerson +
                  '}';
     }

     //GETTERS
     public String getName() {
          return name;
     }
     public String getLastName() {
          return lastName;
     }

     public static int getCounter() {
          return Person.counter;
     }

     //SETTERS
     public void setName(String name) {
          this.name = name;
     }
     public void setLastName(String lastName) {
          this.lastName = lastName;
     }
}
