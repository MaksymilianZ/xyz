package pl;

/**
 * Created by Maksymilian on 2017-02-12.
 */
public class MessagePrinter {

    private MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer){
        this.messageProducer=messageProducer;
    }

    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}
