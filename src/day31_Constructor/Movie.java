package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    /*
    3.1. Create a class named Movie
	    Attributes:
        country (String), title (String), Genre (String), releaseDate (String),
        director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts

     */
    public String  country;
    public String    title;
    public String    Genre;
    public String releaseDate;
    public String director;
    public ArrayList <String> casts = new ArrayList<>();

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre + '\'' +
                ", release Date='" + releaseDate + '\'' +
                ", total number of casts='" + casts.size() +'\'' +
                '}';
    }

    public void addCast (String cast){
        casts.add(cast);
    }


    public void addCasts (String [] castNew){
        casts.addAll(Arrays.asList(castNew));
    }












}
