package baseball.domain;

import baseball.application.RandomNumberGenerator;
import java.util.List;

public class Computer {
    private final Balls balls;

    public Computer() {
        this.balls = createBalls();
    }

    private static Balls createBalls() {
        List<Integer> randomNumbers = RandomNumberGenerator.create();
        return new Balls(randomNumbers);
    }

    public Balls getHasBalls() {
        return this.balls;
    }
}
