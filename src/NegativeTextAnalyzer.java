

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private final String[] SMILES = { ":(", "=(", ":|"};


    @Override
    String[] getKeywords() {

        return SMILES;
    }

    @Override
    Label getLabel() {

        return Label.NEGATIVE_TEXT;
    }

}
