public class L_3_4_9 {

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2.1, 3.2);
        ComplexNumber c2 = new ComplexNumber(2.1, 3.2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}

class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj1) {
        if (this == obj1) {
            return true;
        }
        if (obj1 instanceof ComplexNumber) {
            ComplexNumber obj2 = (ComplexNumber) obj1;
            return (Double.compare(this.getIm(), obj2.getIm()) == 0) && (Double.compare(this.getRe(), obj2.getRe()) == 0);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result=0;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}