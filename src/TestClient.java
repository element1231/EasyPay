import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.tencent.WXPay;
import com.tencent.common.HttpsRequest;
import com.tencent.protocol.pay_protocol.ScanPayReqData;

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
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String device_info = "test device";
		String body = "test";
		String attach = "test attach";
		String out_trade_no = "6000000001";
		int total_fee = 1;
		String spbill_create_ip = "8.8.8.8";
		String time_start = simpleDateFormat.format(new Date());
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.DAY_OF_MONTH, 10);
		String time_expire = simpleDateFormat.format(c.getTime());
		String goods_tag = "test goods";
		String auth_code = "130516824599278888";
		String fee_type = "USD";
		ScanPayReqData scanPayReqData = new ScanPayReqData(auth_code, body, attach, out_trade_no, total_fee, device_info,
				spbill_create_ip, time_start, time_expire, goods_tag,fee_type);
		DefaultScanPayBusinessResultListener resultListener = new DefaultScanPayBusinessResultListener();
		
		try {
			wx.doScanPayBusiness(scanPayReqData, resultListener);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
