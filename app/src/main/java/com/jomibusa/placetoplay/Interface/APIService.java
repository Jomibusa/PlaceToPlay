package com.jomibusa.placetoplay.Interface;

import com.jomibusa.placetoplay.modelo.Request.RqSolicitudInformacion;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("/gateway/information")
    @FormUrlEncoded
    Call<RqSolicitudInformacion> rqSolititudInformacion(@Body RqSolicitudInformacion rqSolicitudInformacion);

    @POST("/gateway/interest")
    @FormUrlEncoded
    Call<RqSolicitudInformacion> rqCalculoIntereses(@Body RqSolicitudInformacion rqSolicitudInformacion);

    @POST("/gateway/otp/generate")
    @FormUrlEncoded
    Call<RqSolicitudInformacion> generacionOTP(@Body RqSolicitudInformacion rqSolicitudInformacion);

    @POST("/gateway/otp/validate")
    @FormUrlEncoded
    Call<RqSolicitudInformacion> validacionOTP(@Body RqSolicitudInformacion rqSolicitudInformacion);

    @POST("/gateway/process")
    @FormUrlEncoded
    Call<RqSolicitudInformacion> rqProcesamientoTransaccion(@Body RqSolicitudInformacion rqSolicitudInformacion);


}
