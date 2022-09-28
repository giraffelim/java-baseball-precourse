package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

class BallNumberPositionTest {
    @Test
    void 공의_자릿수는_1_이상의_값이어야한다() {
        assertThatCode(() -> new BallNumberPosition(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("공의 자릿수는 1부터 3의 값이어야 합니다.");
    }

    @Test
    void 공의_자릿수는_3_이하의_값이어야한다() {
        assertThatCode(() -> new BallNumberPosition(4))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("공의 자릿수는 1부터 3의 값이어야 합니다.");
    }

    @Test
    void 공의_자릿수_생성_테스트() {
        assertThatCode(() -> new BallNumberPosition(3)).doesNotThrowAnyException();
    }

    @Test
    void 서로_다른_객체라도_값이_같을경우_같은_객체로_취급한다() {
        assertThat(new BallNumberPosition(1)).isEqualTo(new BallNumberPosition(1));
    }

    @Test
    void 값이_다를경우_다른_객체로_취급한다() {
        assertThat(new BallNumberPosition(1)).isNotEqualTo(new BallNumberPosition(2));
    }
}