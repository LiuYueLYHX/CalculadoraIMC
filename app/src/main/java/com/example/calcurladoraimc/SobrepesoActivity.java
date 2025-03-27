package com.example.calcurladoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SobrepesoActivity extends AppCompatActivity {
    private TextView EditSobrePeso;
    private TextView MgsSobrePeso;
    private Button btnFecharSobrePeso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sobrepeso);
        Log.i("Ciclo da Vida","Tela Sobrepeso - OnCreate");
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Double peso = bundle.getDouble("peso");
        Double altura = bundle.getDouble("altura");
        Double IMC = bundle.getDouble("IMC");
        String IMCDecimal = String.format("%.2f",IMC);
        EditSobrePeso = findViewById(R.id.EditSobrePeso);
        EditSobrePeso.setText("Peso: " + peso + "\n"
                + "Altura: " + altura + "\n"
                +"IMC: " + IMCDecimal + "\n"
                +"classificação: " + "Sobrepeso");

        MgsSobrePeso = findViewById(R.id.MgsSobrePeso);
        MgsSobrePeso.setText("Você está no caminho para transformar sua saúde e alcançar seus objetivos! O sobrepeso é apenas uma etapa da jornada, e o importante é a decisão de fazer mudanças. Lembre-se de que cada passo em direção ao cuidado com seu corpo é uma vitória. Com foco, determinação e apoio, você pode conquistar a saúde que deseja. Acredite em si mesmo, pois você tem a força necessária para alcançar grandes resultados!");
        btnFecharSobrePeso = findViewById(R.id.btnFecharSobrePeso);
        btnFecharSobrePeso.setOnClickListener(view->{
            Intent intentSobrepeso = new Intent(this, MainActivity.class);
            startActivity(intentSobrepeso);
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
        Log.i("Ciclo da Vida","Tela Sobrepeso - OnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Ciclo da Vida","Tela Sobrepeso - OnResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Ciclo da Vida","Tela Sobrepeso - OnPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Ciclo da Vida","Tela Sobrepeso - OnStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo da Vida","Tela Sobrepeso - OnDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Ciclo da Vida","Tela Sobrepeso - OnRestart");
    }
}