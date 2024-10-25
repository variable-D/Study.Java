package exception.ex1;

public class NetworkClientV1 {
    private final String address;
    public boolean connectError; // 기본값이 false
    public boolean sendError; // 기본값이 false

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "Success";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패 : " + data);
            return "sendError";
        }

        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
        return "Success";
    }

    public void disconnect() {
        // 연결 해제
        System.out.println(address + " 서버 연결 해제");
    }


    public void initError(String data) {
        if(data.equals("error1")) {
            connectError = true;
        }
        if(data.equals("error2")) {
            sendError = true;
        }
    }
}
