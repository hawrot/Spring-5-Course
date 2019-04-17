package academy.learnprogramming.service;

import org.springframework.stereotype.Service;


public interface GameService {

    boolean isGameOver();
    String getMainMessage();
    String getResultMessage();
    void checkGuess(int guess);
    void reset();
}
