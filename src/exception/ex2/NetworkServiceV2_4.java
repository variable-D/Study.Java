package exception.ex2;



public class NetworkServiceV2_4 {
    public void sendMessage(String date)  {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(date);


        try {
            client.connect();
            client.send(date); //1. RuntimeException은 catch 대상이 아님. 예외가 밖으로 던져짐
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
        }
        //NetworkClientException이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시.
        client.disconnect(); // 2. 예외가 발생하면 disconnect()가 호출되지 않음

    }
}
