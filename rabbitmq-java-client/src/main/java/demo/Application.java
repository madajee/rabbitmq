package demo;

public class Application {

    public static void main(String[] args) throws Exception{
    	Producer producer = new Producer();
    	Receiver receiver = new Receiver();
    	producer.send();
    	receiver.receive();
        System.out.println("Hello RabbitMQ in Java");
    }
}