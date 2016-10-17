import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.tencent.common.Configure;
import com.tencent.common.HttpsRequest;
import com.tencent.protocol.pay_protocol.ScanPayReqData;

public class HTTPSPostRequestWithCert {
	public static void test(){
		HttpsRequest hr = null;
		try {
			 hr = new HttpsRequest();
		} catch (UnrecoverableKeyException | KeyManagementException | NoSuchAlgorithmException | KeyStoreException
				| IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	        
		  String appid = "wxce926ea78004260e";
		     String mch_id = "1900012291";
		     String device_info = "test device";
		     String nonce_str = "abcde";
		     String sign = "";
		     String body = "test";
		     String attach = "test attach";
		     String out_trade_no = "1000000001";
		     int total_fee = 1;
		     String spbill_create_ip = "8.8.8.8";
		     String time_start = simpleDateFormat.format(new Date());
		     Calendar c = Calendar.getInstance();
		        c.setTime(new Date());
		        c.add(Calendar.DAY_OF_MONTH,10);
		     String time_expire = simpleDateFormat.format(c.getTime());
		     String goods_tag = "test goods";
		     String auth_code = "120242957324236112";
		     //String sub_mch_id = "11611403";
		
		     ScanPayReqData payData = new ScanPayReqData(auth_code,body, attach, out_trade_no,total_fee,device_info,
				spbill_create_ip,time_start,time_expire,goods_tag);
		     String res = null;
		     try {
				 res = hr.sendPost(Configure.PAY_API, payData);
			} catch (UnrecoverableKeyException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException
					| IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     System.out.println(res);
		
		
	}
}
