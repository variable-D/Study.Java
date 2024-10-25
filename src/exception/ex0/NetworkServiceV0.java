package exception.ex0;

public class NetworkServiceV0 {
    public void sendMessage(String date) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(date);
        client.disconnect();
    }
}
