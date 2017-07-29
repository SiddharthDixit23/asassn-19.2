package com.developers.siddharth.webservicesassignment192.network;


import com.developers.siddharth.webservicesassignment192.utils.CommonUtilities;

/**
 * Created by siddharth on 7/19/2017.
 */

public interface OnWebServiceResult {

    public void getWebResponse(String result, CommonUtilities.SERVICE_TYPE type);
}
