package pl.karolska.homework;

import org.w3c.dom.ls.LSOutput;

public class MainMovie {

    public static void main(String[] args) {
        Movie kinepolexMovie = new Movie("Life in Poland", "Jaroslaw Kaczynski", 150, 2021);

        kinepolexMovie.getTitle();
        kinepolexMovie.getDirector();
        kinepolexMovie.getDuration();
        kinepolexMovie.getYearOfProduction();

        System.out.print("The movie " + kinepolexMovie.getTitle());
        System.out.print(" is directed by " + kinepolexMovie.getDirector());
        System.out.print(" is " + kinepolexMovie.getDuration() + " minutes long");
        System.out.print(" and was produced in year " + kinepolexMovie.getYearOfProduction());



    }
}
