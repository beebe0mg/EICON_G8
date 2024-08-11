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
public class EmpHome1Activity extends AppCompatActivity {

    private void exitProgram() {
        moveTaskToBack(true);
        finishAndRemoveTask();
        System.exit(0);
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Intent intent = new Intent(EmpHome1Activity.this, MainActivity.class);
                startActivity(intent);
            }
        };
        getOnBackPressedDispatcher().addCallback(this, callback);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_emp_home1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button employeehome1 = findViewById(R.id.employeehome1);
        employeehome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpHome1Activity.this, EmpHome2Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        ImageView accounting = findViewById(R.id.accounting);
        accounting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpHome1Activity.this, EmpCert1Activity.class);
                startActivity(intent);
            }
        });

        ImageView seemore = findViewById(R.id.seemore);
        seemore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpHome1Activity.this, EmpCert11Activity.class);
                startActivity(intent);
            }
        });

        ImageView cpa = findViewById(R.id.cpa);
        cpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpHome1Activity.this, EmpCert2Activity.class);
                startActivity(intent);
            }
        });

        ImageView menu_icon1 = findViewById(R.id.menu_icon1);
        menu_icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpHome1Activity.this, EmpHome1Activity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView menu_icon2 = findViewById(R.id.menu_icon2);
        menu_icon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpHome1Activity.this, EmpExtra1Activity.class);
                startActivity(intent);
            }
        });

        ImageView menu_icon3 = findViewById(R.id.menu_icon3);
        menu_icon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpHome1Activity.this, EmpWPH1Activity.class);
                startActivity(intent);
            }
        });

        ImageView menu_icon4 = findViewById(R.id.menu_icon4);
        menu_icon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmpHome1Activity.this, EmpSettingActivity.class);
                startActivity(intent);
            }
        });
    }
}