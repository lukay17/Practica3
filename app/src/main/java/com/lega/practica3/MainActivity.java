package com.lega.practica3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import com.lega.practica3.databinding.ActivityLoginBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ActivityLogin";
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        makeCard();

        listener();

    }

    private void makeCard() {
        binding.ALImage.setImageResource(R.drawable.city);
    }

    private void listener() {


        binding.ALText11.setOnClickListener(view -> {
            Snackbar.make(binding.ALText11, "Función se Implementara Proximamente", Snackbar.LENGTH_SHORT).show();
        });

        binding.ALText21.setOnClickListener(view -> {
            Snackbar.make(binding.ALText11, "Función se Implementara Proximamente", Snackbar.LENGTH_SHORT).show();
        });
    }
}