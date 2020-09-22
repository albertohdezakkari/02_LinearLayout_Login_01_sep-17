package com.svalero.a1_5_0_1_linearlayout_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.svalero.a1_5_0_1_linearlayout_login.interfaces.MyOnClickListener;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText edtEmail;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        // edtEmail.getText().toString();
        // edtPassword.getText().toString();
        // métodos flecha
        // MainActivity = 0X154879F
        btnLogin.setOnClickListener(new MyOnClickListener(this));
    }
    private void initComponents(){
        btnLogin = findViewById(R.id.btnLogin);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword =findViewById(R.id.edtPassword);
    }
    public EditText getEdtEmail() {
        return edtEmail;
    }
    public EditText getEdtPassword() {
        return edtPassword;
    }
}