package xyz.alexandrit.birds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoupleOfBird {
    List<Bird> birds = new ArrayList<>();
    public CoupleOfBird(Bird... birds) {
        this.birds.addAll(Arrays.stream(birds).toList());
    }
    public void sing() {
        for (var bird : birds)
            bird.sing();
    }

}
