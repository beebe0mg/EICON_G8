package com.example.eicon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
//이소리(leesori1410)
public class MainActivity extends AppCompatActivity {
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
                exitProgram();
            }
        };
        getOnBackPressedDispatcher().addCallback(this, callback );

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView ownBtn = findViewById(R.id.own);
        ownBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OwnHTE11Activity.class);
                startActivity(intent);
            }
        });

        ImageView empBtn = findViewById(R.id.emp);
        empBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EmpHome1Activity.class);
                startActivity(intent);
            }
        });




    }
}