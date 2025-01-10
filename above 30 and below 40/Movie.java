/*
32. Create a class named Movie (id, genre). Write the object of Movie class 
into a file named “Comedy.dat” having comedy as genre.
*/

import java.io.*;

class Movie implements Serializable {
    private int id;
    private String genre;

    public Movie(int id, String genre) {
        this.id = id;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie[id=" + id + ", genre=" + genre + "]";
    }

    public static void main(String[] args) {
        Movie comedyMovie = new Movie(101, "Comedy");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Comedy.dat"))) {
            if (comedyMovie.getGenre().equalsIgnoreCase("Comedy")) {
                oos.writeObject(comedyMovie);
                System.out.println("Movie object written to file: Comedy.dat");
            } else {
                System.out.println("The genre is not comedy, no file written.");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
