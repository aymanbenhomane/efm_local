package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText txtnom,txtprenom,txtemail,txtpass;
Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtemail=findViewById(R.id.email);
        txtnom=findViewById(R.id.nom);
        txtpass=findViewById(R.id.password);
        txtprenom=findViewById(R.id.prenom);
        btnlogin=findViewById(R.id.button);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean nom=txtnom.getText().toString()=="alami"?true:false;
                boolean prenom=txtprenom.getText().toString()=="badar"?true:false;
                boolean email=txtemail.getText().toString()=="alami.badar@odppt_edu_ma"?true:false;
                boolean pass=txtpass.getText().toString()=="123"?true:false;
                if (nom&&prenom&&email&&pass){
                    Toast.makeText(MainActivity.this, "Authentification reussie", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Authentification echouee", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case  R.id.inscription:

                Toast.makeText(this, "inscription", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigation:

                Toast.makeText(this, "navigation", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);


    }
}