import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

import com.tencent.WXPay;
import com.tencent.common.HttpsRequest;

public class TestClient {
	public void test(){
		String key = "2ab9071b06b9f739b950ddb41db2690d";
		String appID = "wxce926ea78004260e";
		String mchID = "1900012291";
		String sdbMchID = "11611403";
		String certLocalPath = "/Users/keli/Documents/Easypay/testAcct/cert/apiclient_cert.p12";
		String certPassword = mchID;
		WXPay wx = new WXPay();
		wx.initSDKConfiguration(key, appID, mchID, sdbMchID, certLocalPath, certPassword);
		
		
		
		 //1）https请求可用性测试
		//HTTPSPostRequestWithCert.test();

        //2）测试项目用到的XStream组件，本项目利用这个组件将Java对象转换成XML数据Post给API
        //XStreamTest.test();
//		wx.requestScanPayService(scanPayReqData)
		  //PART Two:基础服务测试
        //--------------------------------------------------------------------

        //1）测试被扫支付API
        ScanPayServiceTest.test();	
        }
	public static void main(String[] args){
		TestClient tc = new TestClient();
		tc.test();
	}
}
