public class Range {
    private String input;

    public Range(String input) {
        this.input = input;
    }

    public boolean isStartWithBracket() {
        return this.input.startsWith("[");
    }
}
