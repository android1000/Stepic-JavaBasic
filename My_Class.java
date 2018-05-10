public class My_Class {
    static class MyClass {
        String name = "my class";

        public MyClass(String name) {
            this.name = name;
        }
        public MyClass() {
        }

    }

    public static void main(String[] args) {
        MyClass c = new MyClass();
        System.out.println(c.name);
    }
}