package baseball.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {
    private static final int FIXED_INPUT_LENGTH = 3;
    public static final char CHAR_ZERO = '0';
    private final Balls balls;

    public Player(String userInputValue) {
        validateInputLength(userInputValue);
        validateInputIsNumber(userInputValue);
        validateInputDuplicateNumber(userInputValue);
        this.balls = createBalls(userInputValue);
    }

    private static Balls createBalls(String userInputValue) {
        List<Integer> numbers = new ArrayList<>();
        for (char c : userInputValue.toCharArray()) {
            numbers.add(c - CHAR_ZERO);
        }
        return new Balls(numbers);
    }

    private static void validateInputLength(String input) {
        if (input.length() != FIXED_INPUT_LENGTH) {
            throw new IllegalArgumentException("Player 생성을 위한 문자열의 길이는 3이어야 합니다.");
        }
    }

    private static void validateInputIsNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("Player 생성을 위한 문자열은 숫자로만 이루어져 있어야 합니다.");
        }
    }

    private static void validateInputDuplicateNumber(String input) {
        Set<Character> duplicateCheckSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            duplicateCheckSet.add(c);
        }
        if (duplicateCheckSet.size() != FIXED_INPUT_LENGTH) {
            throw new IllegalArgumentException("Player 생성을 위한 문자열 내 숫자는 중복될 수 없습니다.");
        }
    }

    public Balls getHasBalls() {
        return this.balls;
    }
}
