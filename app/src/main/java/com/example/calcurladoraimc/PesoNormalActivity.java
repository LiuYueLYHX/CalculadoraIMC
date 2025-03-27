package com.example.calcurladoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PesoNormalActivity extends AppCompatActivity {
    private TextView EditPesoNormal;
    TextView MgsPesoNormal;
    private Button btnFecharPesoNormal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_peso_normal);
        Log.i("Ciclo da Vida","Tela Peso Normal - OnCreate");
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Double peso = bundle.getDouble("peso");
        Double altura = bundle.getDouble("altura");
        Double IMC = bundle.getDouble("IMC");
        EditPesoNormal = findViewById(R.id.EditPesoNormal);
        EditPesoNormal.setText("Peso: " + peso + "\n"
                + "Altura: " + altura + "\n"
                +"IMC: " + IMC + "\n"
                +"classificação: " + "Peso Normal");

        MgsPesoNormal = findViewById(R.id.MgsPesoNormal);
        MgsPesoNormal.setText("Parabéns! Você está cuidando de sua saúde de forma incrível. Manter o peso ideal é uma conquista, mas lembre-se de que o mais importante é continuar priorizando o bem-estar, a alimentação balanceada e o autocuidado. Continue assim, pois cada escolha saudável reflete no seu corpo e na sua vida. Você está no caminho certo e sua saúde é o seu maior tesouro!");
        btnFecharPesoNormal = findViewById(R.id.btnFecharPesoNormal);
        btnFecharPesoNormal.setOnClickListener(view->{
            Intent intentPesoNormal = new Intent(this, MainActivity.class);
            startActivity(intentPesoNormal);
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
        Log.i("Ciclo da Vida","Tela Peso Normal - OnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Ciclo da Vida","Tela Peso Normal - OnResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Ciclo da Vida","Tela Peso Normal - OnPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Ciclo da Vida","Tela Peso Normal - OnStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo da Vida","Tela Peso Normal - OnDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Ciclo da Vida","Tela Peso Normal - OnRestart");
    }
}