import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Person {


    public enum Sex {
        MALE,
        FEMALE
    }

    String name;
    LocalDate birthdate;
    Sex gender;
    String email;

    public Person(){

    }


    public Person(String name, LocalDate birthdate, Sex gender, String email) {
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        Period p = Period.between(this.birthdate, java.time.LocalDate.now());

        return p.getYears();
    }

//    public void setAge(Integer age) {
//        this.age = age;
//    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }

    public void printPerson(){
        String person = "Name: %s Birthday: %s Email: %s Gender: %s";
        person = String.format(person, getName(), getBirthdate(), getEmail(), getGender());
        System.out.println(person);

    }


    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }



    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
}
