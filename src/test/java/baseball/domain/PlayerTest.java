package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PlayerTest {
    @Test
    void Player_생성_테스트() {
        String input = "132";
        assertThatCode(() -> new Player(input)).doesNotThrowAnyException();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1243", "12"})
    void 사용자의_입력의_길이가_3이_아닐경우_생성_불가(String userInput) {
        assertThatCode(() -> new Player(userInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Player 생성을 위한 문자열의 길이는 3이어야 합니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"1+2", "ttt", "!@#"})
    void 사용자의_입력이_숫자로_이루어지지_않은경우_생성_불가(String userInput) {
        assertThatCode(() -> new Player(userInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Player 생성을 위한 문자열은 숫자로만 이루어져 있어야 합니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"111", "112", "121"})
    @Test
    void 사용자의_입력_중_중복된_숫자가_있을경우_생성_불가() {
        assertThatCode(() -> new Player("171"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Player 생성을 위한 문자열 내 숫자는 중복될 수 없습니다.");
    }

    @Test
    void Player_는_3개의_공을_가지고_있다() {
        Balls hasBalls = new Player("179").getHasBalls();
        assertThat(hasBalls.getBall(0)).isEqualTo(new Ball(1));
        assertThat(hasBalls.getBall(1)).isEqualTo(new Ball(7));
        assertThat(hasBalls.getBall(2)).isEqualTo(new Ball(9));
    }
}