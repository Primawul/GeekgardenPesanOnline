package ac.i.pemesanan.retrofit_handle;

import com.google.gson.JsonObject;

import ac.i.pemesanan.Model.ResponRegister;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetrofitMethod {

    @Headers({
            "Content-Type:application/json"
    })

    @POST("auth/signup")
    Call<ResponRegister> registerUser(@Body JsonObject body);

}
