class VariableInit {
    private int i;
    static {
        int i = 1;
    }
    public VariableInit() {
        i = 2;
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getI());
    }
}

class B extends A {
    private int j = 3;
    @Override
    public void setI() { i = j; }
    }

class A {
    protected int i = 1;
    public A() { setI(); }
    public void setI() { i = 2; }
    public int getI() { return i; }
}

