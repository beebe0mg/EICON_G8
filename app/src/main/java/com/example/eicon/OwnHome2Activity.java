package com.example.eicon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
//이소리(leesori1410)
public class OwnHome2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_own_home2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView EFS = findViewById(R.id.EFS);
        EFS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome2Activity.this, OwnReAp1Activity.class);
                startActivity(intent);
            }
        });

        ImageView ReAp = findViewById(R.id.ReAp);
        ReAp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome2Activity.this, OwnReAp2Activity.class);
                startActivity(intent);
            }
        });

        ImageView setting = findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome2Activity.this, OwnSettingActivity.class);
                startActivity(intent);
            }
        });

        ImageView switch_menu = findViewById(R.id.switch_menu);
        switch_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome2Activity.this, OwnSwitchMenuActivity.class);
                startActivity(intent);
            }
        });


        Button own_home2 = findViewById(R.id.own_home2);
        own_home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome2Activity.this, OwnHome1Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        ImageView menu_icon1 = findViewById(R.id.menu_icon1);
        menu_icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome2Activity.this, OwnHome1Activity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView menu_icon2 = findViewById(R.id.menu_icon2);
        menu_icon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome2Activity.this, OwnExtra1Activity.class);
                startActivity(intent);
            }
        });

        ImageView menu_icon3 = findViewById(R.id.menu_icon3);
        menu_icon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome2Activity.this, OwnHTE1Activity.class);
                startActivity(intent);
            }
        });

        ImageView menu_icon4 = findViewById(R.id.menu_icon4);
        menu_icon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OwnHome2Activity.this, OwnSettingActivity.class);
                startActivity(intent);
            }
        });
    }
}