package exception.ex3;

import exception.ex3.exeption.ConnectExceptionV3;
import exception.ex3.exeption.NetworkClientExceptionV3;
import exception.ex3.exeption.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initData(data); // 추가

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (NetworkClientExceptionV3  e) {
            System.out.println("[네트워크 오류] 메세지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메세지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
