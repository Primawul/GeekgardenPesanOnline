package ac.i.pemesanan.Activity;

import ac.i.pemesanan.Model.ResponRegister;
import ac.i.pemesanan.R;
import ac.i.pemesanan.retrofit_handle.RetrofitLinkApi;
import ac.i.pemesanan.retrofit_handle.RetrofitMethod;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.JsonObject;

public class RegisUser extends AppCompatActivity {

    private EditText editText_nama, editText_email, editText_phone, editText_password;

    private Button button_regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis_user);

        editText_nama=findViewById(R.id.editName);
        editText_email=findViewById(R.id.editEmail);
        editText_phone=findViewById(R.id.editphone);
        editText_password=findViewById(R.id.editPass);

        button_regis=findViewById(R.id.buttonAcount);

        button_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userRegis();
            }
        });

    }


    public void userRegis(){

        String nama=editText_nama.getText().toString();
        String email=editText_email.getText().toString();
        String phone=editText_phone.getText().toString();
        String pass=editText_password.getText().toString();

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("nameOrd", String.valueOf(nama));
        jsonObject.addProperty("username", String.valueOf(email));
        jsonObject.addProperty("email", String.valueOf(phone));
        jsonObject.addProperty("password", String.valueOf(pass));

        RetrofitMethod retrofitMethod =  RetrofitLinkApi.getRetrofitLogin().create(RetrofitMethod.class);
        Call<ResponRegister> call= retrofitMethod.registerUser(jsonObject);
        call.enqueue(new Callback<ResponRegister>() {
            @Override
            public void onResponse(Call<ResponRegister> call, Response<ResponRegister> response) {
                if(response.isSuccessful()){
                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(RegisUser.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(RegisUser.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(RegisUser.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(RegisUser.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<ResponRegister> call, Throwable t) {
                Toast.makeText(RegisUser.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(RegisUser.this, Login.class)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
                finish();
            }
        });
    }
}