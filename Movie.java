//import java.util.Scanner;
import java.util.*;

public class Movie {
    String title;
    String year;
    String score;
    String rating;
    String genres[] = new String[8];
    Integer index;

    // Constructors
    public Movie(String movieTitle, String releaseYear, String movieScore, String movieRating, String genre1, String genre2, String genre3, String genre4, String genre5, String genre6, String genre7, String genre8){
        title = movieTitle;
        year = releaseYear;
        score = movieScore;
        rating = movieRating;
        genres[0] = genre1;
        genres[1] = genre2;
        genres[2] = genre3;
        genres[3] = genre4;
        genres[4] = genre5;
        genres[5] = genre6;
        genres[6] = genre7;
        genres[7] = genre8;


    }

    public Movie(String movieTitle, String releaseYear, String movieScore, String movieRating, String genre1, String genre2, String genre3, String genre4, String genre5, String genre6, String genre7){
        this(movieTitle, releaseYear, movieScore, movieRating, genre1, genre2, genre3, genre4, genre5, genre6, genre7, null);
    }

    public Movie(String movieTitle, String releaseYear, String movieScore, String movieRating, String genre1, String genre2, String genre3, String genre4, String genre5, String genre6){
        this(movieTitle, releaseYear, movieScore, movieRating, genre1, genre2, genre3, genre4, genre5, genre6, null, null);
    }

    public Movie(String movieTitle, String releaseYear, String movieScore, String movieRating, String genre1, String genre2, String genre3, String genre4, String genre5){
        this(movieTitle, releaseYear, movieScore, movieRating, genre1, genre2, genre3, genre4, genre5, null, null, null);
    }

    public Movie(String movieTitle, String releaseYear, String movieScore, String movieRating, String genre1, String genre2, String genre3, String genre4){
        this(movieTitle, releaseYear, movieScore, movieRating, genre1, genre2, genre3, genre4, null, null, null, null);
    }

    public Movie(String movieTitle, String releaseYear, String movieScore, String movieRating, String genre1, String genre2, String genre3){
        this(movieTitle, releaseYear, movieScore, movieRating, genre1, genre2, genre3, null, null, null, null, null);
    }

    public Movie(String movieTitle, String releaseYear, String movieScore, String movieRating, String genre1, String genre2){
        this(movieTitle, releaseYear, movieScore, movieRating, genre1, genre2, null, null, null, null, null, null);
    }

    public Movie(String movieTitle, String releaseYear, String movieScore, String movieRating, String genre1){
        this(movieTitle, releaseYear, movieScore, movieRating, genre1, null, null, null, null, null, null, null);
    }



    // Getters for all attributes
    public String getTitle(){
        return title;
    }

    public String getYear(){
        return year;
    }

    public String getScore(){
        return score;
    }

    public String getRating(){
        return rating;
    }

    public String[] getGenres(){
        return genres;
    }

    public Integer getIndex() {return index; }


    // Setters
    public void setScore(String movieScore){
        score = movieScore;
    }

    public void setIndex(Integer movieIndex) { index = movieIndex; }



    // Print Movie object
    public void print(){
        System.out.println("Title:  \"" + title + "\"\n"
                + "Year:   " + year + "\n"
                + "Rating: " + rating + "\n"
                + "Genres: " + Arrays.toString(genres) + "\n"
                + "Score:  " + score + "\n");
    }

    @Override
    public String toString(){
        return title;
    }

    // Main
    public static void main(String []args){
        //System.out.println("########## BEGIN MAIN ##########\n");

        HashMap<String, Movie> library = new HashMap<String, Movie>();

        library.put("The Wizard of Oz", new Movie("The Wizard of Oz", "1939", "9.4", "G", "Classics", "Kids", "Family", "Musical", "Performing Arts", "Science Fiction", "Fantasy"));
        library.put("Citizen Kane", new Movie("Citizen Kane", "1941", "9.4", "PG", "Classics", "Drama", "Mystery", "Suspense"));
        library.put("The Third Man", new Movie("The Third Man", "1949", "9.3", "NR", "Classics", "Mystery", "Suspense"));
        library.put("Get Out", new Movie("Get Out", "2017", "8.3", "R", "Comedy", "Horror", "Mystery", "Suspense"));
        library.put("Mad Max: Fury Road", new Movie("Mad Max: Fury Road", "2015", "8.6", "R", "Action", "Adventure", "Science Fiction", "Fantasy"));
        library.put("The Cabinet of Dr. Caligari", new Movie("The Cabinet of Dr. Caligari", "1920", "9.3", "NR", "Art House", "International", "Classics", "Horror", "Mystery", "Suspense"));
        library.put("All About Eve", new Movie("All About Eve", "1950", "9.1", "PG", "Classics", "Comedy", "Drama"));
        library.put("Inside Out", new Movie("Inside Out", "2015", "8.9", "PG", "Animation", "Kids", "Family"));
        library.put("Metropolis", new Movie("Metropolis", "1927", "9.1", "PG-13", "Action", "Adventure", "Art House", "International", "Classics", "Drama", "Science Fiction", "Fantasy"));
        library.put("The Godfather", new Movie("The Godfather", "1972", "9.2", "R", "Drama"));
        library.put("E.T. The Extra-Terrestrial", new Movie("E.T. The Extra-Terrestrial", "1982", "9.2", "PG", "Kids", "Family", "Science Fiction", "Fantasy"));
        library.put("Modern Times", new Movie("Modern Times", "1936", "9.0", "G", "Classics", "Comedy"));
        library.put("It Happened One Night", new Movie("It Happened One Night", "1934", "8.9", "NR", "Classics", "Comedy", "Romance"));
        library.put("Moonlight", new Movie("Moonlight", "2016", "9.0", "R", "Drama"));
        library.put("Singin' in the Rain", new Movie("Singin' in the Rain", "1952", "9.2", "G", "Classics", "Comedy", "Musical", "Performing Arts", "Romance"));
        library.put("Spotlight", new Movie("Spotlight", "2015", "8.8", "R", "Drama", "Mystery", "Suspense"));
        library.put("Casablanca", new Movie("Casablanca", "1942", "9.3", "PG", "Classics", "Drama", "Romance"));
        library.put("Psycho", new Movie("Psycho", "1960", "9.2", "R", "Classics", "Horror", "Mystery", "Suspense"));
        library.put("Laura", new Movie("Laura", "1944", "8.8", "NR", "Classics", "Mystery", "Suspense"));
        library.put("Nosferatu, A Symphony of Horror", new Movie("Nosferatu, A Symphony of Horror", "1922", "9.0", "NR", "Horror", "Art House", "International", "Classics", "Horror", "Science Fiction", "Fantasy"));
        library.put("Snow White and the seven Dwarfs", new Movie("Snow White and the seven Dwarfs", "1937", "8.8", "G", "Animation", "Classics", "Kids", "Family", "Science Fiction", "Fantasy"));
        library.put("A Hard Day's Night", new Movie("A Hard Day's Night", "1964", "8.5", "G", "Classics", "Comedy", "Musical", "Performing Arts"));
        library.put("Dunkirk", new Movie("Dunkirk", "2017", "8.6", "PG-13", "Action", "Adventure", "Drama"));
        library.put("Wonder Woman", new Movie("Wonder Woman", "2017", "7.6", "PG-13", "Action", "Adventure", "Drama", "Science Fiction", "Fantasy"));
        library.put("North By Northwest", new Movie("North By Northwest", "1959", "9.0", "NR", "Classics", "Mystery", "Suspense"));
        library.put("Boyhood", new Movie("Boyhood", "2014", "9.2", "R", "Drama"));
        library.put("The Big Sick", new Movie("The Big Sick", "2017", "8.2", "R", "Comedy", "Romance"));
        library.put("La Grande Illusion", new Movie("La Grande Illusion", "1938", "9.4", "NR", "Art House", "International", "Classics", "Drama"));
        library.put("The Battle of Algiers", new Movie("The Battle of Algiers", "1967", "9.1", "NR", "Art House", "International", "Drama"));
        library.put("The Maltese Falcon", new Movie("The Maltese Falcon", "1941", "9.0", "PG", "Drama", "Mystery", "Suspense"));
        library.put("King Kong", new Movie("King Kong", "1933", "9.0", "G", "Action", "Adventure", "Classics", "Horror"));
        library.put("12 Years a Slave", new Movie("12 Years a Slave", "2013", "8.9", "R", "Drama"));
        library.put("Repulsion", new Movie("Repulsion", "1965", "8.9", "NR", "Drama", "Classics", "Horror", "Mystery", "Suspense"));
        library.put("Gravity", new Movie("Gravity", "2013", "9.0", "PG-13", "Drama", "Science Fiction", "Fantasy"));
        library.put("Sunset Boulevard", new Movie("Sunset Boulevard", "1950", "9.3", "G", "Classics", "Drama"));
        library.put("Rashomon", new Movie("Rashomon", "1951", "9.3", "NR", "Art House", "International", "Classics", "Drama", "Mystery", "Suspense"));
        library.put("Logan", new Movie("Logan", "2017", "7.9", "R", "Action", "Adventure", "Drama", "Science Fiction", "Fantasy"));
        library.put("Selma", new Movie("Selma", "2015", "8.7", "PG-13", "Drama"));
        library.put("The Adventures of Robin Hood", new Movie("The Adventures of Robin Hood", "1938", "8.9", "PG", "Adventure", "Action", "Adventure", "Classics", "Romance"));
        library.put("Rear Window", new Movie("Rear Window", "1954", "8.9", "PG", "Classics", "Drama", "Mystery", "Suspense"));
        library.put("Taxi Driver", new Movie("Taxi Driver", "1976", "9.0", "R", "Drama", "Mystery", "Suspense"));
        library.put("Star Wars: Episode VII - The Force Awakens", new Movie("Star Wars: Episode VII - The Force Awakens", "2015", "8.2", "PG-13", "Action", "Adventure", "Science Fiction", "Fantasy"));
        library.put("Toy Story 3", new Movie("Toy Story 3", "2010", "8.9", "G", "Animation", "Comedy", "Kids", "Family", "Science Fiction", "Fantasy"));
        library.put("Argo", new Movie("Argo", "2012", "8.4", "R", "Drama", "Mystery", "Suspense"));
        library.put("Zootopia", new Movie("Zootopia", "2016", "8.0", "PG", "Action", "Adventure", "Animation", "Comedy"));
        library.put("Toy Story 2", new Movie("Toy Story 2", "1999", "8.6", "G", "Animation", "Comedy", "Kids", "Family", "Science Fiction", "Fantasy"));
        library.put("The Bride of Frankenstein", new Movie("The Bride of Frankenstein", "1935", "9.1", "NR", "Classics", "Horror", "Science Fiction", "Fantasy", "Special Interest"));
        library.put("M", new Movie("M", "1931", "9.2", "NR", "Art House", "International", "Drama", "Mystery", "Suspense"));
        library.put("The Philadelphia Story", new Movie("The Philadelphia Story", "1940", "8.8", "NR", "Classics", "Comedy", "Romance"));
        library.put("Alien", new Movie("Alien", "1979", "9.0", "R", "Drama", "Mystery", "Suspense", "Science Fiction", "Fantasy"));
        library.put("Hell or High Water", new Movie("Hell or High Water", "2016", "8.5", "R", "Drama", "Mystery", "Suspense"));
        library.put("Seven Samurai", new Movie("Seven Samurai", "1956", "9.3", "G", "Action", "Adventure", "Art House", "International", "Classics", "Drama"));
        library.put("Bicycle Thieves", new Movie("Bicycle Thieves", "1949", "9.1", "NR", "Drama"));
        library.put("The Treasure of the Sierra Madre", new Movie("The Treasure of the Sierra Madre", "1948", "9.0", "NR", "Action", "Adventure", "Classics", "Drama", "Western"));
        library.put("Up", new Movie("Up", "2009", "8.7", "PG", "Action", "Adventure", "Animation", "Comedy", "Kids", "Family"));
        library.put("Arrival", new Movie("Arrival", "2016", "8.4", "PG-13", "Drama", "Mystery", "Suspense", "Science Fiction", "Fantasy"));
        library.put("12 Angry Men", new Movie("12 Angry Men", "1957", "9.0", "NR", "Classics", "Drama"));
        library.put("The 400 Blows", new Movie("The 400 Blows", "1959", "9.3", "NR", "Art House", "International", "Classics", "Drama"));
        library.put("Baby Driver", new Movie("Baby Driver", "2017", "8.0", "R", "Action", "Adventure", "Comedy", "Drama"));
        library.put("All Quiet on the Western Front", new Movie("All Quiet on the Western Front", "1930", "9.0", "PG", "Western", "Classics", "Drama"));
        library.put("Army of Shadows", new Movie("Army of Shadows", "1969", "8.6", "NR", "Art House", "International", "Drama"));
        library.put("A Streetcar Named Desire", new Movie("A Streetcar Named Desire", "1951", "8.7", "PG", "Classics", "Drama"));
        library.put("The Night of the Hunter", new Movie("The Night of the Hunter", "1955", "9.1", "PG", "Drama", "Mystery", "Suspense"));
        library.put("Lawrence of Arabia", new Movie("Lawrence of Arabia", "1962", "9.1", "PG", "Action", "Adventure", "Classics", "Drama"));
        library.put("The Babadook", new Movie("The Babadook", "2014", "8.2", "NR", "Drama", "Horror", "Mystery", "Suspense"));
        library.put("The Conformist", new Movie("The Conformist", "1970", "8.9", "R", "Art House", "International", "Drama"));
        library.put("Vertigo", new Movie("Vertigo", "1958", "8.8", "PG", "Classics", "Drama", "Mystery", "Suspense", "Romance"));
        library.put("Dr. Strangelove Or How I Learned to Stop Worrying and Love the Bomb", new Movie("Dr. Strangelove Or How I Learned to Stop Worrying and Love the Bomb", "1964", "9.1", "PG", "Classics", "Comedy", "Science Fiction", "Fantasy"));
        library.put("Frankenstein", new Movie("Frankenstein", "1931", "8.7", "NR", "Classics", "Horror", "Science Fiction", "Fantasy", "Special Interest"));
        library.put("Tough of Evil", new Movie("Tough of Evil", "1958", "8.9", "PG-13", "Classics", "Drama", "Mystery", "Suspense"));
        library.put("The Dark Knight", new Movie("The Dark Knight", "2008", "8.6", "PG-13", "Action", "Adventure", "Drama", "Science Fiction", "Fantasy"));
        library.put("Rebecca", new Movie("Rebecca", "1940", "8.7", "NR", "Classics", "Drama", "Mystery", "Suspense"));
        library.put("La La Land", new Movie("La La Land", "2016", "8.6", "PG-13", "Comedy", "Drama", "Musical", "Performing Arts"));
        library.put("Rosemary's Baby", new Movie("Rosemary's Baby", "1968", "8.8", "R", "Classics", "Horror", "Mystery", "Suspense"));
        library.put("Finding Nemo", new Movie("Finding Nemo", "2003", "8.7", "G", "Animation", "Comedy", "Kids", "Family"));
        library.put("The Wrestler", new Movie("The Wrestler", "2008", "8.4", "R", "Drama"));
        library.put("L.A. Confidential", new Movie("L.A. Confidential", "1977", "8.8", "R", "Drama", "Mystery", "Suspense"));
        library.put("The 39 Steps", new Movie("The 39 Steps", "1935", "8.9", "NR", "Action", "Adventure", "Classics", "Mystery", "Suspense"));
        library.put("The Good, the Bad and the Ugly", new Movie("The Good, the Bad and the Ugly", "1966", "8.8", "R", "Western"));
        library.put("Gone With the Wind", new Movie("Gone With the Wind", "1939", "8.6", "G", "Drama", "Classics", "Romance"));
        library.put("Spiderman: Homecoming", new Movie("Spiderman: Homecoming", "2017", "7.6", "PG-13", "Action", "Adventure", "Drama", "Science Fiction", "Fantasy"));
        library.put("The Jungle Book", new Movie("The Jungle Book", "2016", "7.8", "PG", "Action", "Adventure", "Kids", "Family"));
        library.put("Open City", new Movie("Open City", "1946", "9.1", "NR", "Art House", "International", "Drama"));
        library.put("Skyfall", new Movie("Skyfall", "2012", "8.2", "PG-13", "Action", "Adventure", "Mystery", "Suspense"));
        library.put("Tokyo Story", new Movie("Tokyo Story", "1953", "9.7", "G", "Art House", "International", "Drama"));
        library.put("Manchester by the Sea", new Movie("Manchester by the Sea", "2016", "8.9", "R", "Drama"));
        library.put("Pinocchio", new Movie("Pinocchio", "1940", "9.1", "G", "Animation", "Kids", "Family", "Musical", "Performing Arts", "Science Fiction", "Fantasy"));
        library.put("War for the Planet of the Apes", new Movie("War for the Planet of the Apes", "2017", "8.1", "PG-13", "Action", "Adventure", "Drama"));
        library.put("On the Waterfront", new Movie("On the Waterfront", "1954", "9.1", "NR", "Classics", "Drama", "Romance"));
        library.put("It Follows", new Movie("It Follows", "2015", "8.1", "R", "Horror"));
        library.put("Apocalypse Now", new Movie("Apocalypse Now", "1979", "8.9", "R", "Action", "Adventure", "Drama"));
        library.put("High Noon", new Movie("High Noon", "1952", "8.8", "PG", "Mystery", "Suspense", "Western"));
        library.put("Jaws", new Movie("Jaws", "1975", "9.2", "PG", "Action", "Adventure", "Drama", "Mystery", "Suspense"));
        library.put("The Wages of Fear", new Movie("The Wages of Fear", "1953", "8.9", "NR", "Art House", "International", "Drama", "Mystery", "Suspense"));
        library.put("The Last Picture Show", new Movie("The Last Picture Show", "1971", "9.1", "R", "Classics", "Drama"));
        library.put("Harry Potter and the Deathly Hallows - Part 2", new Movie("Harry Potter and the Deathly Hallows - Part 2", "2011", "8.3", "PG-13", "Action", "Adventure", "Drama", "Kids", "Family", "Mystery", "Suspense", "Science Fiction"));
        library.put("The Grapes of Wrath", new Movie("The Grapes of Wrath", "1940", "9.0", "G", "Classics", "Drama"));
        library.put("Roman Holiday", new Movie("Roman Holiday", "1953", "8.4", "NR", "Classics", "Comedy", "Drama", "Romance"));
        library.put("I Am Not Your Negro", new Movie("I Am Not Your Negro", "2017", "8.9", "PG-13", "Documentary"));
        library.put("Man on Wire", new Movie("Man on Wire", "2008", "8.4", "PG-13", "Documentary", "Special Interest"));



        // Set the index for  every item in the hash map
        int count = 0;
        for(Map.Entry<String, Movie> entry:library.entrySet()){
            Movie m = entry.getValue();
            m.setIndex(count);
            count++;
        }

        // Print the index and title of every movie in the hash map
        for(Map.Entry<String, Movie> entry:library.entrySet()){
            String key = entry.getKey();
            Movie m = entry.getValue();
            System.out.println("\n##########\nIndex: " + m.getIndex());
            System.out.println("Title: " + m.getTitle());
        }

//        // Print every Key/Value pair in the hash map
//        int count = 0;
//        for(Map.Entry<String, Movie> entry:library.entrySet()){
//            count++;
//            String key = entry.getKey();
//            Movie m = entry.getValue();
//            System.out.println("##### " + count);
//            System.out.println("\nKey: " + key);
//            System.out.println(String.format("\nValue: %s, %s, %s, %s, %s\n", m.getTitle(), m.getYear(), m.getScore(), m.getRating(), Arrays.toString(m.getGenres())));
//        }

//        // Change the score on a movie in the hash map
//        System.out.println("\n########## EXAMPLE:\n");
//        Movie example = library.get("Get Out"); // Original score: "8.3"
//        example.setScore("9.9");
//        example.print();
//
//
//        // Get individual genres of each movie
//        Movie example2 = library.get("Jaws");
//        String theGenres[] = example2.getGenres();
//        for (int i = 0; i < theGenres.length; i++) {
//            System.out.println(theGenres[i]);
//        }


        System.out.println("\n########## END MAIN ##########\n");
    }
}
