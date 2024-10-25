package exception.ex1;



public class NetworkServiceV1_2 {
    public void sendMessage(String date) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(date); // 추가

        String connectResult = client.connect();
        // 결과가 성공이 아니다. -> 오류다.
        if(isSuccess(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return;
        }
        String sendResult = client.send(date);
        if(isSuccess(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }
        client.disconnect();
    }

    private static boolean isSuccess(String connectResult) {
        return !connectResult.equals("Success");
    }
}
