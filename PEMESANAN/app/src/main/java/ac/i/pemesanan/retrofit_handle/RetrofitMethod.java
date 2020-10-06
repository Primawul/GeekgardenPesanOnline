package ac.i.pemesanan.retrofit_handle;

import ac.i.pemesanan.Model.ResponRegister;
import ac.i.pemesanan.Model.ResponToken;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RetrofitMethod {

    @FormUrlEncoded
    @POST("auth/login")
    Call<ResponRegister> registerUser(@Field("nameOrd") String name, @Field("username") String username, @Field("email") String email, @Field("password") String password);


    @FormUrlEncoded
    @POST("auth/login")
    Call<ResponToken> loginUser(@Field("usernameOrEmai") String usernameOrEmai, @Field("password") String password);

}
