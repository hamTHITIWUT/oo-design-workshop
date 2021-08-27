public class Range {
    private String input;
    private static final int BEGIN_INDEX_START_NUMBER = 1;
    private static final int END_INDEX_START_NUMBER = 2;
    private static final int BEGIN_INDEX_END_NUMBER = 3;
    private static final int END_START_END_NUMBER = 4;
    private static final String OPEN_BRACKET = "[";
    private static final String CLOSE_BRACKET = "]";

    public Range(String input) {
        this.input = input;
    }

    public boolean isStartWithInclusive() {
        return input.startsWith(OPEN_BRACKET);
    }

    public int getStartInput() {
        return Integer.parseInt(input.substring(BEGIN_INDEX_START_NUMBER, END_INDEX_START_NUMBER));
    }

    public int getEndInput() {
        return Integer.parseInt(input.substring(BEGIN_INDEX_END_NUMBER, END_START_END_NUMBER));
    }

    public boolean isEndWithInclusive() {
        return input.endsWith(CLOSE_BRACKET);
    }
}
