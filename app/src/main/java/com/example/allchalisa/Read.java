package com.example.allchalisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Read extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
    }

    public void btn1(View view) {
        Intent intent = new Intent(this,ShreeHanumanChalisa.class);
        startActivity(intent);
    }
    public void btn2(View view) {
        Intent intent = new Intent(this,ShreeGaneshChalisa.class);
        startActivity(intent);
    }
    public void btn3(View view) {
        Intent intent = new Intent(this,ShreeShaniChalisa.class);
        startActivity(intent);

    }
    public void btn4(View view) {
        Intent intent = new Intent(this,ShreeShivChalisa.class);
        startActivity(intent);
    }
    public void btn5(View view) {
        Intent intent = new Intent(this,ShreeSurayChalisa.class);
        startActivity(intent);
    }
    public void btn6(View view) {
        Intent intent = new Intent(this,ShreeKrishnaChalisa.class);
        startActivity(intent);
    }
    public void btn7(View view) {
        Intent intent = new Intent(this,ShreeDurgaChalisa.class);
        startActivity(intent);
    }
    public void btn8(View view) {
        Intent intent = new Intent(this,ShreeRamChalisa.class);
        startActivity(intent);
    }
    public void btn9(View view) {
        Intent intent = new Intent(this,ShreeLakshmiChalisa.class);
        startActivity(intent);
    }
    public void btn10(View view) {
        Intent intent = new Intent(this,ShreeSaraswatiChalisa.class);
        startActivity(intent);
    }
}