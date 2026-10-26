package com.example.missions;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView ivPet;
    private Button btnChangePet;
    private boolean isCat = true; // משתנה בוליאני שיעזור לנו לזכור מי מוצג עכשיו


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivPet = findViewById(R.id.ivPet);
        btnChangePet = findViewById(R.id.btnChangePet);

        btnChangePet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCat) {
                    ivPet.setImageResource(R.drawable.dog); // שינוי לכלב
                    isCat = false;
                } else {
                    ivPet.setImageResource(R.drawable.cat); // חזרה לחתול
                    isCat = true;
                }
            }
        });

    }
}