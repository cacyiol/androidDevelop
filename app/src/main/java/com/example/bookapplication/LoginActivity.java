package com.example.bookapplication;

//public class LoginActivity {
//}

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 在这里执行登录操作，检查用户名和密码
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // 示例：简单的用户名和密码验证
                if (username.equals("Kylie") && password.equals("password")) {
                    // 登录成功
                    Toast.makeText(LoginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();

                    //登录成功后跳转
                    Intent intent = new Intent(LoginActivity.this, IndexActivity.class);
                    startActivity(intent);

                } else {
                    // 登录失败
                    Toast.makeText(LoginActivity.this, "Login failed. Please check your credentials.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}