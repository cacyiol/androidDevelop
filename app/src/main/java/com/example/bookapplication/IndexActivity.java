package com.example.bookapplication;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.content.Intent;
//import android.widget.EditText;
//import android.widget.Toast;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class IndexActivity extends AppCompatActivity {
//    private Button buttonBorrow;
//    private Button buttonReturn;
//    private TextView tip;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState); //创建一个屏幕
//        setContentView(R.layout.activity_index); //指明路径
//
//        //链接对应button和TextView
//        buttonReturn = findViewById(R.id.giveBack);
//        buttonBorrow = findViewById(R.id.borrow);
//        tip = findViewById(R.id.borrowTip);
//
//        //对点击事件做出响应
//        buttonBorrow.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                showSuccessDialog("You have successfully borrowed a book.");
//            }
//        });
//
//        buttonReturn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // 具体还书的逻辑可以在这里处理
//                showSuccessDialog("You have successfully returned the book.");
//            }
//        });
//
//        private void showSuccessDialog(String message){
//            // 创建弹窗
//            AlertDialog.Builder builder = new AlertDialog.Builder(this);
//            builder.setTitle("Success")
//                    .setMessage(message)
//                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                        public void onClick(DialogInterface dialog, int which) {
//                            // 点击 OK 按钮时不执行任何操作
//                        }
//                    });
//            // 显示弹窗
//            final AlertDialog dialog = builder.create();
//            dialog.show();
//
//            // 延时 3 秒后关闭弹窗
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    if (dialog.isShowing()) {
//                        dialog.dismiss();
//                    }
//                }
//            }, 3000);
//        }
//
//    }
//
//}



import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class IndexActivity extends AppCompatActivity {

    private Button buttonBorrow;
    private Button buttonReturn;
    private TextView tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        buttonBorrow = findViewById(R.id.borrow);
        buttonReturn = findViewById(R.id.giveBack);
        tip = findViewById(R.id.borrowTip);

        buttonBorrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSuccessDialog("You have successfully borrowed a book.");
            }
        });

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 具体还书的逻辑可以在这里处理
                showSuccessDialog("You have successfully returned the book.");
            }
        });
    }

    private void showSuccessDialog(String message) {
        // 创建弹窗
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Success")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // 点击 OK 按钮时不执行任何操作
                    }
                });

        // 显示弹窗
        final AlertDialog dialog = builder.create();
        dialog.show();

        // 延时 3 秒后关闭弹窗
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (dialog.isShowing()) {
                    dialog.dismiss();
                }
            }
        }, 3000);
    }
}

