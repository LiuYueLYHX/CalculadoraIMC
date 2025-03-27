package com.example.calcurladoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculoIMCActivity extends AppCompatActivity {

    EditText peso;
    EditText altura;
    private Button btnCalcIMC;
    private Button btnLimpar;
    private Button btnFechar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculo_imcactivity);
        Log.i("Ciclo da Vida","Tela Calculadora IMC - OnCreate");

        peso = findViewById(R.id.peso);
        altura = findViewById(R.id.altura);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnLimpar.setOnClickListener(view->{
            peso.setText("");
            altura.setText("");
        });

        btnCalcIMC = findViewById(R.id.btnCalcIMC);

        btnCalcIMC.setOnClickListener(view->{
            double DoublePeso = Double.parseDouble(peso.getText().toString());
            double DoubleAltura = Double.parseDouble(peso.getText().toString());
            double IMC = DoubleAltura/DoublePeso;
            if(IMC < 18.5) {
                Intent intent = new Intent(this, AbaixoDoPesoActivity.class);
                startActivity(intent);
            }else if(IMC >= 18.5 && IMC < 25){
                Intent intent = new Intent(this, PesoNormalActivity.class);
                startActivity(intent);
            }else if(IMC >= 25 && IMC < 30){
                Intent intent = new Intent(this, SobrepesoActivity.class);
                startActivity(intent);
            }else if(IMC >=30 && IMC < 35){
                Intent intent = new Intent(this, Obesidade1Activity.class);
                startActivity(intent);
            }else if(IMC >= 35 && IMC < 40){
                Intent intent = new Intent(this, Obesidade2Activity.class);
                startActivity(intent);
            }else{
                Intent intent = new Intent(this, Obesidade3Activity.class);
                startActivity(intent);
            }
        });


        btnFechar = findViewById(R.id.btnFechar);
        btnFechar.setOnClickListener(view->{
            Intent intent = new Intent(this, MainActivity.class);
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
        Log.i("Ciclo da Vida","Tela Calculadora IMC - OnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Ciclo da Vida","Tela Calculadora IMC - OnResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Ciclo da Vida","Tela Calculadora IMC - OnPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Ciclo da Vida","Tela Calculadora IMC - OnStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo da Vida","Tela Calculadora IMC - OnDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Ciclo da Vida","Tela Calculadora IMC - OnRestart");
    }
}