

import com.tencent.business.SettlementQueryBusiness;
import com.tencent.protocol.downloadbill_protocol.DownloadBillResData;
import com.tencent.protocol.pay_query_protocol.ScanPayQueryResData;
import com.tencent.settlement_query_protocol.SettlementQueryResData;

/**
 * User: rizenguo
 * Date: 2014/12/3
 * Time: 10:42
 */
public class DefaultSettlementQueryRequestBusinessResultListener implements SettlementQueryBusiness.ResultListener {

    public static final String ON_FAIL_BY_RETURN_CODE_ERROR = "on_fail_by_return_code_error";
    public static final String ON_FAIL_BY_RETURN_CODE_FAIL = "on_fail_by_return_code_fail";
    public static final String ON_DOWNLOAD_BILL_FAIL = "on_download_bill_fail";
    public static final String ON_DOWNLOAD_BILL_SUCCESS = "on_download_bill_success";

    private String result = "";

    public void onFailByReturnCodeError(SettlementQueryResData downloadBillResData) {
        result = ON_FAIL_BY_RETURN_CODE_ERROR;
    }

    @Override
    public void onFailByReturnCodeFail(SettlementQueryResData downloadBillResData) {
        result = ON_FAIL_BY_RETURN_CODE_FAIL;
    }

    public void onDownloadBillFail(String response) {
        result = ON_DOWNLOAD_BILL_FAIL;
    }

    public void onDownloadBillSuccess(String response) {
        result = ON_DOWNLOAD_BILL_SUCCESS;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

	@Override
	public void onFailBySignInvalid(SettlementQueryResData settlementQueryResData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRefundQueryFail(SettlementQueryResData settlementQueryResData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRefundQuerySuccess(SettlementQueryResData settlementQueryResData) {
		// TODO Auto-generated method stub
		
	}

	
}
