package nested.inner.ex1;

public class Network {

    public void SendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}
