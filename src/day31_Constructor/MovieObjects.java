package day31_Constructor;

import java.util.Arrays;

public class MovieObjects {
   /*
    2. create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
    */

    public static void main(String[] args) {


        Movie movie1 = new Movie("USA","Journey to SDET: Cydeo Batch 23","10/25/2021",
                "Kuzzat Altay");

        System.out.println(movie1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

movie1.addCast("Asiya");

        System.out.println(movie1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

String [] ADDcast = {"Muhtar","Adam","Nawar","Waleed","Rana"};

movie1.addCasts(ADDcast);

        System.out.println(movie1);













    }






























}
