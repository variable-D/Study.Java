package exception.ex2;



public class NetworkServiceV2_5 {
    public void sendMessage(String date)  {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(date);


        try {
            client.connect();
            client.send(date); //1. RuntimeException은 catch 대상이 아님. 예외가 밖으로 던져짐
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
        }finally {
            client.disconnect(); // 2. 예외가 발생하더라도 disconnect()가 호출됨

        }
    }
}
