

import com.tencent.business.QueryExchangeRateBusiness;
import com.tencent.query_exchange_rate_protocol.QueryExchangeRateResData;

/**
 * User: rizenguo
 * Date: 2014/12/3
 * Time: 10:42
 */
public class DefaultQueryExchangeRateRequestBusinessResultListener implements QueryExchangeRateBusiness.ResultListener {

    public static final String ON_FAIL_BY_RETURN_CODE_ERROR = "on_fail_by_return_code_error";
    public static final String ON_FAIL_BY_RETURN_CODE_FAIL = "on_fail_by_return_code_fail";
    public static final String ON_DOWNLOAD_BILL_FAIL = "on_download_bill_fail";
    public static final String ON_DOWNLOAD_BILL_SUCCESS = "on_download_bill_success";

    private String result = "";

    public void onFailByReturnCodeError(QueryExchangeRateResData queryExchangeRateResData) {
        result = ON_FAIL_BY_RETURN_CODE_ERROR;
    }

    public void onFailByReturnCodeFail(QueryExchangeRateResData queryExchangeRateResData) {
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

	public void onFailBySignInvalid(QueryExchangeRateResData queryExchangeRateResData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRefundQueryFail(QueryExchangeRateResData queryExchangeRateResData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRefundQuerySuccess(QueryExchangeRateResData queryExchangeRateResData) {
		// TODO Auto-generated method stub
		
	}

	
}
