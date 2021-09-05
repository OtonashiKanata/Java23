package pl.karolska.homework;

public class Movie {
    private String title;
    private String director;
    private int duration;
    private int yearOfProduction;

    public Movie(String title, String director, int duration, int yearOfProduction) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.yearOfProduction = yearOfProduction;
    }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getYearOfProduction() {
            return yearOfProduction;
        }

        public void setYearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;

        }

    }

