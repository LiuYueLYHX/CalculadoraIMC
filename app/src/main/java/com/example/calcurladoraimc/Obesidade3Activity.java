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

public class Obesidade3Activity extends AppCompatActivity {
    private TextView EditObesidade3;
    private TextView MgsObesidade3;
    private Button btnFecharObesidade3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_obesidade3);
        Log.i("Ciclo da Vida","Tela Obsesidade 3 - OnCreate");
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Double peso = bundle.getDouble("peso");
        Double altura = bundle.getDouble("altura");
        Double IMC = bundle.getDouble("IMC");
        String IMCDecimal = String.format("%.2f",IMC);
        EditObesidade3 = findViewById(R.id.EditObesidade3);
        EditObesidade3.setText("Peso: " + peso + "\n"
                + "Altura: " + altura + "\n"
                +"IMC: " + IMCDecimal + "\n"
                +"classificação: " + "Obesidade 3");

        MgsObesidade3 = findViewById(R.id.MgsObesidade3);
        MgsObesidade3.setText("Você é mais forte do que pensa e cada dia é uma nova oportunidade para recomeçar. O caminho para a mudança pode ser desafiador, mas você não está sozinho(a) nessa jornada. Procure apoio, cuide da sua saúde e lembre-se de que um passo de cada vez é o suficiente. Acredite em sua capacidade de transformar sua vida e alcançar a saúde que você merece. A mudança começa agora, e você tem todo o poder para conquistá-la!");
        btnFecharObesidade3 = findViewById(R.id.btnFecharObesidade3);
        btnFecharObesidade3.setOnClickListener(view->{
            Intent intentObesidade3 = new Intent(this, MainActivity.class);
            startActivity(intentObesidade3);
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
        Log.i("Ciclo da Vida","Tela Obesidade 3 - OnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Ciclo da Vida","Tela Obesidade 3 - OnResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Ciclo da Vida","Tela Obesidade 3 - OnPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Ciclo da Vida","Tela Obesidade 3 - OnStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo da Vida","Tela Obesidade 3 - OnDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Ciclo da Vida","Tela Obesidade 3 - OnRestart");
    }
}