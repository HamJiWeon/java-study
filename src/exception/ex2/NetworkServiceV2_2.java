package exception.ex2;

public class NetworkServiceV2_2 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initData(data); // 추가

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }
        client.disconnect();
    }
}