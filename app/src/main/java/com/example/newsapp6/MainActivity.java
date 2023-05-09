package com.example.newsapp6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fragment fragment = BlankFragment.newInstance();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction()
                .replace(R.id.area,fragment,"BlankFragment");
        transaction.commit();

    }
}