import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TestPerson {


    LocalDate cumple3 = LocalDate.of(1993, 6, 21);
    LocalDate cumple2 = LocalDate.of(1996, 9, 12);
    LocalDate cumple = LocalDate.of(2001, 2, 21);

    @Test
    public void ageTest() {
        Person yo = new Person("laura", cumple, Person.Sex.FEMALE, "email@email");
        int expected = 20;
        int actual = yo.getAge();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        Person bts = new Person("jk", cumple2, Person.Sex.MALE, "hisemail@email");
        String expected = "jk";
        String actual = bts.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName2() {
        String expected = "jon";

        Person persona = new Person();
        persona.setName("jon");
        String actual = persona.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void bithdateTest() {
        //GIVEN
        Person bts = new Person("suga", cumple3, Person.Sex.MALE, "JDUFDFI");
        LocalDate expected = cumple3;

        //WHEN
        LocalDate actual = bts.getBirthdate();
        //THEN
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void bithdateTest2() {
        //GIVEN
        Person bts = new Person();
        LocalDate expected = LocalDate.of(1993, 2, 2);
        bts.setBirthdate(expected);
        LocalDate actual = bts.getBirthdate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void genderTest() {

        Person.Sex expected = Person.Sex.MALE;

        Person persona = new Person();
         persona.setGender(expected);
        Person.Sex actual = persona.getGender();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void genderTest2() {
        //GIVEN
        Person yo = new Person("laura", cumple, Person.Sex.FEMALE, "email@email");
        Person.Sex expected = Person.Sex.FEMALE;
        //WHEN
        Person.Sex actual = yo.getGender();

        //THEN
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void emailTest(){
        Person yo = new Person("laura", cumple, Person.Sex.FEMALE, "email@email");
        String expected = "email@email";

        String actual = yo.getEmail();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void setEmailTest(){
        Person bts = new Person();
        String expected = "email@email";
        bts.setEmail(expected);

        String actual = bts.getEmail();

        Assert.assertEquals(expected, actual);
    }



}
