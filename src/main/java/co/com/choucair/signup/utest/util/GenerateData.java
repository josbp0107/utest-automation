package co.com.choucair.signup.utest.util;

import com.github.javafaker.Faker;

public class GenerateData {

    Faker faker = new Faker();

    public String firstName() {
        return faker.name().firstName();
    }

    public String lastName(){
        return faker.name().lastName();
    }

    public String email(){
        return faker.internet().emailAddress();
    }

    public String city(){
        return faker.country().capital();
    }

    public String zipCode(){
        return faker.address().zipCode();
    }

}
