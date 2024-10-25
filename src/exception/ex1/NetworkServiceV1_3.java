package exception.ex1;



public class NetworkServiceV1_3 {
    public void sendMessage(String date) {
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(date); // 추가

        String connectResult = client.connect();
        // 결과가 성공이 아니다. -> 오류다.
        if (isSuccess(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);

        }else {
            String sendResult = client.send(date);
            if (isSuccess(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);

            }
         }
        client.disconnect(); // 무조건 연결 해제를 해야한다. 이유는 자원을 많이 사용하기 때문이다. 그래서 이 코드는 무조건 실행되어야 한다.
                                // 그래서 return을 사용하지 않고, if-else문을 사용했다.
    }

    private static boolean isSuccess(String connectResult) {
        return !connectResult.equals("Success");
    }
}
