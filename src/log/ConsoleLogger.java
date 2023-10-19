package log;

/**
 * Выводит логи в консоль
 */
public class ConsoleLogger implements Logable {
    @Override
    public void log(String message) {
        System.out.println(" LOG :  " + message); // output to the console
    }
}
