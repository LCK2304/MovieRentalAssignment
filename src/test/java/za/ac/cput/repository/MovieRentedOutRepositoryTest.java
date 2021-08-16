package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.MovieRentedOut;
import za.ac.cput.factory.MoviesRentedOutFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)

public class MovieRentedOutRepositoryTest {
    private static MovieRentedOutRepository repository = MovieRentedOutRepository.getRepository();
    private static MovieRentedOut movieRentedOut = MoviesRentedOutFactory.build(5, 6);

    @Test
    void a_create(){
        MovieRentedOut created = repository.create(movieRentedOut);
        assertEquals(created.getMovieID(), movieRentedOut.getMovieID());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read(){
        MovieRentedOut read = repository.read(movieRentedOut.getMovieID());

        System.out.println("Read" + read);
    }

    @Test
    void c_update(){
        MovieRentedOut updated = new MovieRentedOut.MovieRentedOutBuilder().copy(movieRentedOut).setMovieID("").build();

        System.out.println("Update: " + updated);
    }

     @Test
     void e_delete(){
        boolean success = repository.delete(movieRentedOut.getMovieID());

         System.out.println("Delete: "+ success);
     }

    @Test
    void d_getAll(){
        System.out.println("Show All: ");
        System.out.println(repository.getAll());
    }
}
