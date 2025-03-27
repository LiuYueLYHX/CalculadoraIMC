package com.example.calcurladoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Obesidade1Activity extends AppCompatActivity {
    private TextView EditObesidade1;
    private TextView MgsObesidade1;
    private Button btnFecharObesidade1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_obesidade1);
        Log.i("Ciclo da Vida","Tela Obsesidade 1 - OnCreate");

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Double peso = bundle.getDouble("peso");
        Double altura = bundle.getDouble("altura");
        Double IMC = bundle.getDouble("IMC");
        String IMCDecimal = String.format("%.2f",IMC);
        EditObesidade1 = findViewById(R.id.EditObesidade1);
        EditObesidade1.setText("Peso: " + peso + "\n"
                + "Altura: " + altura + "\n"
                +"IMC: " + IMCDecimal + "\n"
                +"classificação: " + "Obesidade 1");

        MgsObesidade1 = findViewById(R.id.MgsObesidade1);
        MgsObesidade1.setText("Você está no controle da sua jornada para uma vida mais saudável! Cada pequeno passo conta e, com determinação, você pode conquistar grandes resultados. Lembre-se: não é sobre perfeição, mas sobre progresso. Busque apoio, cuide de si mesmo e celebre cada conquista ao longo do caminho. Você é capaz de transformar sua saúde e se sentir ainda melhor!");

        btnFecharObesidade1 = findViewById(R.id.btnFecharObesidade1);
        btnFecharObesidade1.setOnClickListener(view->{
            Intent intentObesidade1 = new Intent(this, MainActivity.class);
            startActivity(intentObesidade1);
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
        Log.i("Ciclo da Vida","Tela Obesidade 1 - OnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Ciclo da Vida","Tela Obesidade 1- OnResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Ciclo da Vida","Tela Obesidade 1 - OnPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Ciclo da Vida","Tela Obesidade 1 - OnStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo da Vida","Tela Obesidade 1 - OnDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Ciclo da Vida","Tela Obesidade 1 - OnRestart");
    }
}