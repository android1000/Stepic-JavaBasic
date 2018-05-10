public class L_4_1_10 {
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        if (stackTraceElements.length > 2) {
            return stackTraceElements[2].getClassName().toString() + "#" + stackTraceElements[2].getMethodName().toString();
        }
        return null;
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }
}
