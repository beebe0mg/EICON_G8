package com.example.eicon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
//이소리(leesori1410)
public class OwnHome1Activity extends AppCompatActivity {
    private void exitProgram() {
        moveTaskToBack(true);
        finishAndRemoveTask();
        System.exit(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Intent intent = new Intent(OwnHome1Activity.this, MainActivity.class);
                startActivity(intent);
            }
        };
        getOnBackPressedDispatcher().addCallback(this, callback);

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_own_home1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button ownhome1activity = findViewById(R.id.ownhome1activity);
        ownhome1activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome1Activity.this, OwnHome2Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        ImageView ownhome1activity_button1 = findViewById(R.id.ownhome1activity_button1);
        ownhome1activity_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome1Activity.this, OwnReAp2Activity.class);
                startActivity(intent);
            }
        });

        ImageView ownhome1activity_button2 = findViewById(R.id.ownhome1activity_button2);
        ownhome1activity_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome1Activity.this, OwnReAp1Activity.class);
                startActivity(intent);
            }
        });

        ImageView menu_icon1 = findViewById(R.id.menu_icon1);
        menu_icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome1Activity.this, OwnHome1Activity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView menu_icon2 = findViewById(R.id.menu_icon2);
        menu_icon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome1Activity.this, OwnExtra1Activity.class);
                startActivity(intent);
            }
        });

        ImageView menu_icon3 = findViewById(R.id.menu_icon3);
        menu_icon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome1Activity.this, OwnHTE1Activity.class);
                startActivity(intent);
            }
        });

        ImageView menu_icon4 = findViewById(R.id.menu_icon4);
        menu_icon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome1Activity.this, OwnSettingActivity.class);
                startActivity(intent);
            }
        });


    }
}