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

    public  String month(){
        int number = (int)(Math.random()*(12)+1);
        return "number:"+number;
    }

    public String day(){
        int number = (int)(Math.random()*(28)+1);
        return "number:"+number;
    }

    public String year(){
        int number = (int)(Math.random()*((2003 - 1872) + 1)) + 1872;
        return "number:"+number;
    }

    public String city(){
        return faker.country().capital();
    }

    public String zipCode() {
        return faker.address().zipCode();
    }

}
