package com.example.edcan_summervacation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.edcan_summervacation.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        binding.setName("");
        binding.setEmail("");
        binding.setPw("");
        binding.setPwcheck("");

        binding.btnRegiSignup.setOnClickListener(view -> {
            register(binding.getName(),binding.getEmail(),binding.getPw(),binding.getPwcheck());
        });
    }

    private void register(String name, String Email, String pw, String pwcheck){
        
    }
}