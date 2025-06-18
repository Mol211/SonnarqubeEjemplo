package curso.es;
import java.util.logging.Logger;

public class App {
        private static final Logger LOGGER = Logger.getLogger(App.class.getName()); 
    public static void main( String[] args ) {
        LOGGER.info("Hello World");
    }
    public static double sumar(double numero, double numero2) {
        return numero+numero2;
    }
    public static double doblar(double numero){
        return numero * 2;
    }

}
