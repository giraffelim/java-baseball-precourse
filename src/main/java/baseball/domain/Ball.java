package baseball.domain;

import java.util.Objects;

public class Ball {
    private final BallNumber ballNumber;
    private final BallNumberPosition position;

    public Ball(final int number, final int position) {
        this.ballNumber = new BallNumber(number);
        this.position = new BallNumberPosition(position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        return Objects.equals(ballNumber, ball.ballNumber) && Objects.equals(position, ball.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNumber, position);
    }
}
