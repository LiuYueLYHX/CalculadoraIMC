package com.example.calcurladoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnCalcIMC ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Log.i("Ciclo da Vida","Tela Inicial - OnCreate");
        btnCalcIMC = findViewById(R.id.btnCalcIMC);
        btnCalcIMC.setOnClickListener(view ->{
            Intent intent = new Intent(this, CalculoIMCActivity.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Ciclo da Vida","Tela Inicial - OnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Ciclo da Vida","Tela Inicial - OnResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Ciclo da Vida","Tela Inicial - OnPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Ciclo da Vida","Tela Inicial - OnStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo da Vida","Tela Inicial - OnDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Ciclo da Vida","Tela Inicial - OnRestart");
    }
}