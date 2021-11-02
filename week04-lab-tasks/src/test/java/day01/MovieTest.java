package day01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {

    @Test
    void movieTest() {
        Movie movie = new Movie("Titanic",1997);
        movie.addActor(new Actor("Leonardo DiCaprio", 1974));
        movie.addActor(new Actor("Kate Winslet", 1975));
        movie.addActor(new Actor("Billy Zane", 1966));

        assertEquals(2, movie.actorsInTheirTwenties());
        assertEquals("Titanic", movie.getFilmTitle());
        assertEquals(1997, movie.getReleaseDate());
        assertEquals(3, movie.getActors().size());
    }

}
