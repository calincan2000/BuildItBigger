package com.mircea.jokes;

import java.util.Random;

public class Jokes {
    public String getJoke() {
        String[] jokes = new String[5];
        jokes[0] = "What did the marlin say to the swordfish?\n" +
                "'You're looking sharp! \uD83D\uDD2A'";
        jokes[1] = "Did you hear the joke about the roof?\n" +
                "I would tell you, but it tends to go over people's heads \uD83D\uDE1C";

        jokes[2] = "What's the difference between ignorance and apathy?\n" +
                "I don't know and I don't care \uD83D\uDE12";

        jokes[3] = "What do you get from a pampered cow?\n" +
                "Spoiled milk \uD83D\uDC2E";

        jokes[4] = "What did the mama cow say to the baby cow?\n" +
                "It's pasture bedtime \uD83D\uDC2E";
        return jokes[new Random().nextInt(jokes.length)];
    }
}
