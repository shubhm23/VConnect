package com.example.vconnect;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Services extends Activity {
    Button b1, b2, b3, b4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);

        b1.setOnClickListener(view -> {
            Toast.makeText(Services.this, "Wifi and Bluetooth Settings", Toast.LENGTH_SHORT).show();
        });

        b2.setOnClickListener(view -> {
            Toast.makeText(Services.this, "Remote Setting", Toast.LENGTH_SHORT).show();
        });

        b3.setOnClickListener(view -> {
            Toast.makeText(Services.this, "Screen Mirroring", Toast.LENGTH_SHORT).show();
        });

        b4.setOnClickListener(view -> {
            Toast.makeText(Services.this, "Storage", Toast.LENGTH_SHORT).show();
        });
    }
}

//public class RegisterActivity extends Activity {
//
//    TextInputEditText etRegEmail;
//    TextInputEditText etRegPassword;
//    TextView tvLoginHere;
//    Button btnRegister;
//
//    FirebaseAuth mAuth;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register);
//
//        etRegEmail = findViewById(R.id.etRegEmail);
//        etRegPassword = findViewById(R.id.etRegPass);
//        tvLoginHere = findViewById(R.id.tvLoginHere);
//        btnRegister = findViewById(R.id.btnRegister);
//
//        mAuth = FirebaseAuth.getInstance();
//
//        btnRegister.setOnClickListener(view ->{
//            createUser();
//        });
//
//        tvLoginHere.setOnClickListener(view ->{
//            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
//        });
//    }
//
//    private void createUser(){
//        String email = etRegEmail.getText().toString();
//        String password = etRegPassword.getText().toString();
//
//        if (TextUtils.isEmpty(email)){
//            etRegEmail.setError("Email cannot be empty");
//            etRegEmail.requestFocus();
//        }else if (TextUtils.isEmpty(password)){
//            etRegPassword.setError("Password cannot be empty");
//            etRegPassword.requestFocus();
//        }else{
//            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task) {
//                    if (task.isSuccessful()){
//                        Toast.makeText(RegisterActivity.this, "User registered successfully", Toast.LENGTH_SHORT).show();
//                        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
//                    }else{
//                        Toast.makeText(RegisterActivity.this, "Registration Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//        }
//    }
//
//}