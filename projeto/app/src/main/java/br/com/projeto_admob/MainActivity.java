package br.com.projeto_admob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //add admob
        //implementacao na qual está no site https://developers.google.com/admob/android/quick-start
        // Initialize Mobile Ads SDK
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        //Select an ad format Banner
        //Load an ad
        //atribui na variavel mAdview o id do elemento da activity
            mAdView = findViewById(R.id.adView);
            //cria um Builder do tipo Adrequest
            AdRequest adRequest = new AdRequest.Builder().build();
            //carrega o parametro dentro do metodo loadAd
            mAdView.loadAd(adRequest);
    }
}
