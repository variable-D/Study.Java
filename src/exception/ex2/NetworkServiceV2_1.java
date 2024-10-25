package exception.ex2;



public class NetworkServiceV2_1 {
    public void sendMessage(String date) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(date);

        client.connect();
        client.send(date);
        client.disconnect();
    }
}
