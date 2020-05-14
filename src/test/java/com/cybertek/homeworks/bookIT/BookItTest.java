package com.cybertek.homeworks.bookIT;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookItTest {

    public static void main(String[] args) throws InterruptedException {

        BookIT test=new BookIT();

        test.login("mstacey8r@imdb.com","skylargiblin");



     //   StringUtility.verifyEquals("https://cybertek-reservation-qa3.herokuapp.com/map",test.driver.getCurrentUrl());


        test.driver.quit();

     /*
        //1.test case negative scenario

        for (int i=0;i<=5;i++) {
        BookIT test=new BookIT();
        Faker faker = new Faker();

            test.login(faker.internet().emailAddress(), faker.internet().password());

            StringUtility.verifyEquals(test.driver.getCurrentUrl(),"https://cybertek-reservation-qa3.herokuapp.com/sign-in");

            test.driver.quit();
        }
*/















    }

}
