package movies;

import util.Input;


public class MoviesApplication {
    public static void getAllMoviesFromCategory(String category, Movie[] movies){
        for (Movie movie : movies){
            String name = movie.getName();
            if (category.equals(movie.getCategory())){
                System.out.printf("%s -- %s%n", name, category);
            }
        }
    }
//    public static Person[] addPerson(Person[] personArray, Person newPerson){
//
//        Person[] newArrayOfPeople = new Person[personArray.length + 1];
//
//        System.arraycopy(personArray, 0, newArrayOfPeople, 0, personArray.length);
//        newArrayOfPeople[newArrayOfPeople.length -1] = newPerson;
//        return newArrayOfPeople;
//    }
    public static Movie[] addMovie(Movie[] movieArray, Movie newMovie){
        Movie[] newMovieArray = new Movie[movieArray.length + 1];
        System.arraycopy(movieArray, 0, newMovieArray, 0, movieArray.length);
        newMovieArray[newMovieArray.length -1] = newMovie;
        return newMovieArray;
    }
    public static void main(String[] args) {

        Input input = new Input();//We know the input class allows us to get input from the user
        String usersInput = " ";
        Movie[] movies = MoviesArray.findAll();


        while(!usersInput.equals("0")){
            System.out.println("What would you like to do? \n\t0 - exit \n\t1 - view All movies \n\t2 - view movies in the Animated category \n\t3 - view movies in the Drama category \n\t4 - view movies in the Horror category \n\t5 - view movies in the SciFi category \n\t6 - view movies in the Musical category \n\t7 - add a movie to the list \n");
            usersInput = input.getString("Enter your choice: ");
            switch(usersInput){
                case "0":
                    break;
                case "1":
                    for (Movie movie : movies){
                        String name = movie.getName();
                        String category = movie.getCategory();
                        System.out.printf("%s -- %s%n", name, category);
                    }
                    break;
                case "2":
                    for (Movie movie : movies){
                        //need variable to compare the category
                        String category = movie.getCategory();
                        String name = movie.getName();
                        if (category.equals("animated")){
                            System.out.printf("%s -- %s%n", name, category);
                        }
                    }
                    break;
                case "3":
                   getAllMoviesFromCategory("drama", movies);
                    break;
                case "4":
                    getAllMoviesFromCategory("horror", movies);
                    break;
                case "5":
                    getAllMoviesFromCategory("scifi", movies);
                    break;
                case "6":
                    getAllMoviesFromCategory("musical", movies);
                    break;
                case "7":
                    String title = input.getString("Enter the name of the movie:");
                    String category = input.getString("Enter the category of the movie:");
                    Movie newMovie = new Movie(title, category);
                    movies = addMovie(movies, newMovie);
                    break;
                default:
                    System.out.println("Please Enter a selection: 0 - 5");






                }




            }//End of While







    }//End of Main
}//End of Class
