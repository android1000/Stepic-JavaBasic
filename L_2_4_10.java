import java.util.Arrays;

public class L_2_4_10 {

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        int j = 0;
        for (String str : roles) {
            j = 0;
            res = res.append(str + ":" + "\n");
            i++;
            for (String strLines : textLines) {
                j++;
                if (strLines.indexOf(str + ":") == 0) {
                    res = res.append(new StringBuilder(strLines).replace(0, str.length() + 1, Integer.toString(j) + ")") + "\n");
                    i++;
                }
            }
            res = res.append("\n");
            i++;
        }
        return res.toString();
    }


    public static void main(String[] args) {
        String[] roles = {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"
        };
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        System.out.println(printTextPerRole(roles, textLines));
    }
}
