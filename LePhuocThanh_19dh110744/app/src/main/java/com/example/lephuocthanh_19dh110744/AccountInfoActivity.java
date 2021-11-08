package com.example.lephuocthanh_19dh110744;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AccountInfoActivity extends AppCompatActivity {
    EditText edtName,edtEmail,edtPass,edtUsername;
    RadioGroup rdbGender;
    Button btnSave;
    String filename="caches";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_info);
        getSupportActionBar().setTitle("Account Info");
        edtName=findViewById(R.id.editText1);
        edtEmail=findViewById(R.id.editText2);
        edtPass=findViewById(R.id.editText3);
        edtUsername=findViewById(R.id.editText4);
        Intent intent=getIntent();
        edtName.setText(intent.getStringExtra("Username"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if(item.getItemId()==R.id.mnuSave){
            SharedPreferences sharedPreferences = getSharedPreferences("filename", MODE_PRIVATE);
            SharedPreferences.Editor editor= sharedPreferences.edit();

            Toast.makeText(AccountInfoActivity.this, "Saved", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}