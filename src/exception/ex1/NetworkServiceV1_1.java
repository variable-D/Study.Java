package exception.ex1;



public class NetworkServiceV1_1 {
    public void sendMessage(String date) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(date);

        client.connect();
        client.send(date);
        client.disconnect();
    }
}
