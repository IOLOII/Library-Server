package fun.extract.libraryController;
import java.net.HttpURLConnection;
import java.net.URL;


public class test {

	public static int testWsdlConnection(String address) throws Exception {
        int status = 404;
        try {
            URL urlObj = new URL(address);
            HttpURLConnection oc = (HttpURLConnection) urlObj.openConnection();
            oc.setUseCaches(false);
            oc.setConnectTimeout(3000); // 设置超时时间
            status = oc.getResponseCode();// 请求状态
            if (200 == status) {
                // 200是请求地址顺利连通。。
                return status;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return status;
    }
	public static void main(String[] args) throws Exception {
		testWsdlConnection("http://localhost:8080/test/imgtest.jpg");
	}
}
