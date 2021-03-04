package com.jomibusa.placetoplay.modelo.data;

import com.jomibusa.placetoplay.Interface.APIService;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "https://dev.placetopay.com/rest/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }

}
