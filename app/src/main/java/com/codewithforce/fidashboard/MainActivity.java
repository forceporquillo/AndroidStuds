package com.codewithforce.fidashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nameUser, walletCurrency, review, network, apps, plugins, mainmenus,
    pageTitle, pagesubtitle, developername;

    Button bttnguide;
    Animation atg, atgtwo, atgthree;

    ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        atg = AnimationUtils.loadAnimation(this ,R.anim.atg);
        atgtwo = AnimationUtils.loadAnimation(this ,R.anim.atgtwo);
        atgthree = AnimationUtils.loadAnimation(this ,R.anim.atgthree);

        nameUser = findViewById(R.id.nameUser);
        walletCurrency = findViewById(R.id.walletCurrency);

        imageView3 = findViewById(R.id.imageView3);

        // menus
        review = findViewById(R.id.review);
        network = findViewById(R.id.network);
        apps = findViewById(R.id.apps);
        plugins = findViewById(R.id.plugins);
        mainmenus = findViewById(R.id.mainmenus);

        //titles
        pageTitle = findViewById(R.id.pageTitle);
        pagesubtitle = findViewById(R.id.pagesubtitle);
        developername = findViewById(R.id.developername);

        bttnguide = findViewById(R.id.bttnguide);

        // set animation
        imageView3.startAnimation(atg);
        pageTitle.startAnimation(atgtwo);
        pagesubtitle.startAnimation(atgtwo);
        bttnguide.startAnimation(atgthree);
        developername.startAnimation(atgthree);

        // import fonts
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/ml.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/mm.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(), "fonts/mr.ttf");

        // fonts
        nameUser.setTypeface(MMedium);
        walletCurrency.setTypeface(MLight);

        mainmenus.setTypeface(MRegular);

        review.setTypeface(MMedium);
        network.setTypeface(MMedium);
        apps.setTypeface(MMedium);
        plugins.setTypeface(MMedium);
        mainmenus.setTypeface(MMedium);


        bttnguide.setTypeface(MMedium);
        pageTitle.setTypeface(MRegular);
        pagesubtitle.setTypeface(MLight);

        developername.setTypeface(MRegular);

    }
}
