import java.util.Arrays;

public class L_3_5_8 {

    public static void main(String[] args) {
        byte[] b = {'C','a','t',' ','i','s',' ','g','o','n','e','!'};//4,5,6,127};
        AsciiCharSequence sq = new AsciiCharSequence(b);
        System.out.println("length: " + sq.length());
        System.out.println("charAt: " + sq.charAt(2));
        System.out.println("subSequence: " + sq.subSequence(1,2));
        System.out.println("toString: " + sq.toString());
        for(int i=0; i<sq.length();i++){
            System.out.println(i + " " + String.format("%-3s",new String(new StringBuilder().append(sq.getValue(i)))) +": " +sq.charAt(i));
        }

    }
}

class AsciiCharSequence implements CharSequence{
    private byte[] value;

    public AsciiCharSequence(){}

    public AsciiCharSequence(AsciiCharSequence AsciiCharSequence){
        this.value=AsciiCharSequence.value;
    }

    public AsciiCharSequence(byte[] var1){
        this.value= Arrays.copyOf(var1, var1.length);
    }


    public int length(){
        return value.length;
    }

    public char charAt(int var1) {
        return ((char)value[var1]);
    }

    public CharSequence subSequence(int var1, int var2){
        if (var1 < 0) {
            throw new StringIndexOutOfBoundsException(var1);
        } else if (var2 > this.length()) {
            throw new StringIndexOutOfBoundsException(var2);
        } else {
            int var3 = var2 - var1;
            if (var3 < 0) {
                throw new StringIndexOutOfBoundsException(var3);
            } else {
                byte[] var4 = new byte[var3];
                System.arraycopy(this.value, var1, var4, 0, var3);
                return var1 == 0 && var2 == this.value.length ? this : new AsciiCharSequence(var4);
            }
        }
    }

    public byte getValue(int var1) {
        return value[var1];
    }

    public String toString(){
        StringBuilder s=new StringBuilder();
        for (int i=0; i<this.length();i++){
            s=s.append(charAt(i));
        }
        return s.toString();
    }

}