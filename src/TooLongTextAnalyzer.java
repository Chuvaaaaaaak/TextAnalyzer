

public class TooLongTextAnalyzer implements TextAnalyzer {
    private final int MAX_LENGTH;

    public TooLongTextAnalyzer(int maxLength) {
        this.MAX_LENGTH = maxLength;
    }


    @Override
    public Label processText(String text) {
        return (text.length() > MAX_LENGTH) ? Label.TOO_LONG : Label.OK;
    }

}
