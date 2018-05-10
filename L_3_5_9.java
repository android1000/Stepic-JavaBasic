import java.util.Arrays;

public class L_3_5_9 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

abstract class KeywordAnalyzer implements TextAnalyzer{
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


interface TextAnalyzer {
    Label processText(String text);
}

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

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

class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
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

class TooLongTextAnalyzer implements TextAnalyzer{
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

/*checkLabels(TextAnalyzer[] analyzers, String text) {
    for (TextAnalyzer anal: analyzers){
        if (anal.processText(text)!=Label.OK)  return anal.processText(text);
    }
    return Label.OK;
}
*/
