import java.time.LocalDate;
import java.time.Period;

public class Person {


    public enum Sex {
        MALE,
        FEMALE
    }

    String name;
    LocalDate birthdate;
    Sex gender;
    String email;


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
}
