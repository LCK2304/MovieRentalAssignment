package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.NumberOfMoviesRented;
import za.ac.cput.factory.NumberOfMoviesRentedFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class NumberOfMoviesRentedRepositoryTest {

        private static NumberOfMoviesRentedRepository repository = NumberOfMoviesRentedRepository.getRepository();
        private static NumberOfMoviesRented numberOfMoviesRented = NumberOfMoviesRentedFactory.build(5,"7",9,2);

        @Test
        void a_create(){
            NumberOfMoviesRented created = repository.create(numberOfMoviesRented);
            assertEquals(created.getUserID(), numberOfMoviesRented.getUserID());
            System.out.println("Create: " + created);
        }

        @Test
        void b_read(){
            NumberOfMoviesRented read = repository.read(NumberOfMoviesRented.getUserID());

            System.out.println("Read" + read);
        }

        @Test
        void c_update(){
            NumberOfMoviesRented updated = new NumberOfMoviesRented.NumberOfMoviesRentedBuilder().copy(numberOfMoviesRented).setUserID("").build();

            System.out.println("Update: " + updated);
        }

        @Test
        void e_delete(){
            boolean success = repository.delete(numberOfMoviesRented.getUserID());

            System.out.println("Delete: "+ success);
        }

        @Test
        void d_getAll(){
            System.out.println("Show All: ");
            System.out.println(repository.getAll());
        }
    }
