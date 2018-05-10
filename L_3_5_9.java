import java.util.Arrays

public abstract class KeywordAnalyzer implements TextAnalyzer{
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        for (String kw: getKeywords()) {
            if (text.contains(kw)) return getLabel();
        }
        return Label.OK;
    }
}

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String[] keywords;

    public SpamAnalyzer (String[] str){
        keywords = Arrays.copyOf(str, str.length);
    }

    @Override
    public String[] getKeywords(){
        return Arrays.copyOf(keywords, keywords.length);
    }

    @Override
    public Label getLabel(){
        return Label.SPAM;
    }
}

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private final String[] Smiles ={":(", "=(", ":|"};

    public NegativeTextAnalyzer(){}

    @Override
    public String[] getKeywords(){
        return Arrays.copyOf(Smiles, Smiles.length);
    }

    @Override
    public Label getLabel(){
        return Label.NEGATIVE_TEXT;
    }
}

public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;

    public TooLongTextAnalyzer(int var1){
        this.maxLength=var1;
    }

    public Label processText(String text) {
        return text.length()<=getMaxLength() ? Label.OK : Label.TOO_LONG;
    }

    public int getMaxLength(){
        return this.maxLength;
    }
}

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer anal: analyzers){
            if (anal.processText(text)!=Label.OK)  return anal.processText(text);
        }
        return Label.OK;
    }

public interface TextAnalyzer {
    Label processText(String text);
}

public enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}
