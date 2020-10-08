package ac.i.pemesanan.Activity;

import ac.i.pemesanan.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent home=new Intent(SplashScreen.this, RegisUser.class);
                startActivity(home);
                finish();

            }
        },3000);
    }
}