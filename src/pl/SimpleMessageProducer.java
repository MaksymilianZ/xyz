package pl;

/**
 * Created by Maksymilian on 2017-02-12.
 */
public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage (){
        return "Przykladowa wiadomosc" + System.currentTimeMillis();
    }
}
