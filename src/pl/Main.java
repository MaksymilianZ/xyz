package pl;

/**
 * Created by Maksymilian on 2017-02-12.
 */
public class Main {
    public static void main(String[]args){

        MessageProducer fileMsgProducer = new FileMessageProducer();
        MessagePrinter messagePrinter = new MessagePrinter(fileMsgProducer);
        messagePrinter.printMessage();

        MessageProducer simpleMsgProducer = new SimpleMessageProducer();
        MessagePrinter messagePrinter1 = new MessagePrinter(simpleMsgProducer);
        messagePrinter1.printMessage();
    }
}
