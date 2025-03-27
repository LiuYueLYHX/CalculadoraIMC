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

public class Obesidade2Activity extends AppCompatActivity {
    private TextView EditObesidade2;
    private TextView MgsObesidade2;
    private Button btnFecharObesidade2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_obesidade2);
        Log.i("Ciclo da Vida","Tela Obsesidade 2 - OnCreate");
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Double peso = bundle.getDouble("peso");
        Double altura = bundle.getDouble("altura");
        Double IMC = bundle.getDouble("IMC");
        String IMCDecimal = String.format("%.2f",IMC);
        EditObesidade2 = findViewById(R.id.EditObesidade2);
        EditObesidade2.setText("Peso: " + peso + "\n"
                + "Altura: " + altura + "\n"
                +"IMC: " + IMCDecimal + "\n"
                +"classificação: " + "Obesidade 2");

        MgsObesidade2 = findViewById(R.id.MgsObesidade2);
        MgsObesidade2.setText("A jornada para uma vida mais saudável começa com o primeiro passo, e você já está em movimento! Lembre-se de que cada esforço, por menor que pareça, é uma vitória. Com apoio, paciência e determinação, você pode alcançar seus objetivos. A mudança é possível, e você é mais forte do que imagina. Não desista, pois o melhor ainda está por vir!");
        btnFecharObesidade2 = findViewById(R.id.btnFecharObesidade2);
        btnFecharObesidade2.setOnClickListener(view->{
            Intent intentObesidade2 = new Intent(this, MainActivity.class);
            startActivity(intentObesidade2);
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
        Log.i("Ciclo da Vida","Tela Obesidade 2 - OnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Ciclo da Vida","Tela Obesidade 2 - OnResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Ciclo da Vida","Tela Obesidade 2 - OnPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Ciclo da Vida","Tela Obesidade 2 - OnStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo da Vida","Tela Obesidade 2 - OnDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Ciclo da Vida","Tela Obesidade 2 - OnRestart");
    }
}