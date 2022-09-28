package baseball.domain;

import java.util.Objects;

public class BallNumberPosition {
    public static final int MIN_POSITION = 1;
    public static final int MAX_POSITION = 3;
    private final int position;

    public BallNumberPosition(int position) {
        if (position < MIN_POSITION || MAX_POSITION < position) {
            throw new IllegalArgumentException("공의 자릿수는 1부터 3의 값이어야 합니다.");
        }
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BallNumberPosition that = (BallNumberPosition) o;
        return position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
