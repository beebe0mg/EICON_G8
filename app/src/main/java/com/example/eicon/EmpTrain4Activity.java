package com.example.eicon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
//이소리(leesori1410)
public class EmpTrain4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_emp_train4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView emptrain4activity = findViewById(R.id.emptrain4activity_button);
        emptrain4activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpTrain4Activity.this, EmpTrain5Activity.class);
                startActivity(intent);
            }
        });

        ImageView menu_icon1 = findViewById(R.id.menu_icon1);
        menu_icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpTrain4Activity.this, EmpHome1Activity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView menu_icon2 = findViewById(R.id.menu_icon2);
        menu_icon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpTrain4Activity.this, EmpExtra1Activity.class);
                startActivity(intent);
            }
        });

        ImageView menu_icon3 = findViewById(R.id.menu_icon3);
        menu_icon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpTrain4Activity.this, EmpWPH1Activity.class);
                startActivity(intent);
            }
        });

        ImageView menu_icon4 = findViewById(R.id.menu_icon4);
        menu_icon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpTrain4Activity.this, EmpSettingActivity.class);
                startActivity(intent);
            }
        });
    }
}