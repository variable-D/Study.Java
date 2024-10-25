package exception.ex2;



public class NetworkServiceV2_3 {
    public void sendMessage(String date)  {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(date);


        try {
            client.connect();
            client.send(date);
            client.disconnect(); // 예외 발생시 무시
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
        }
    }
}
