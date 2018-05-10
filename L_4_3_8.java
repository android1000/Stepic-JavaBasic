import java.util.logging.*;

public class L_4_3_8 {
private static final Logger LOGGER = Logger.getLogger(L_4_3_8.class.getName());

    public static void main(String[] args) {

    }

    private static void configureLogging(){
        Logger LogA= Logger.getLogger("org.stepic.java.logging.ClassA");
        LogA.setLevel(Level.ALL);

        Logger LogB= Logger.getLogger("org.stepic.java.logging.ClassB");
        LogB.setLevel(Level.WARNING);

        Logger LogC= Logger.getLogger("org.stepic.java");
        LogC.setUseParentHandlers(false);
        ConsoleHandler consoleHandler= new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        LogC.addHandler(consoleHandler);
        XMLFormatter xmlFormatter=new XMLFormatter();
        consoleHandler.setFormatter(xmlFormatter);
    }
}
