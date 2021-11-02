package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String filmTitle;
    private int releaseDate;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String filmTitle, int releaseDate) {
        this.filmTitle = filmTitle;
        this.releaseDate = releaseDate;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int sum = 0;

        for (Actor actor: actors) {
            int actorAge = releaseDate - actor.getBirthYear();
            if (actorAge > 19 && actorAge < 30) {
                sum++;
            }
        }
        return sum;
    }
}
