


public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private final String[] KEYWORDS;

    public SpamAnalyzer(String[] keywords) {
        this.KEYWORDS = keywords;
    }

    @Override
    String[] getKeywords() {

        return KEYWORDS;
    }

    @Override
    Label getLabel() {

        return Label.SPAM;
    }


}
