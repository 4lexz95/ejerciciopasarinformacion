package alex.example.ejerciciopasarinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnletras;
    private Button btnpalabras;
    private EditText txtpalabras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicilizarvistas();
        btnletras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Calculadora.class)
               Bundle bundle = new Bundle();
                bundle.putString("FRASE", txtpalabras.getText().toString());
                bundle.putInt("BOTON", view.getId());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        btnpalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frases = txtpalabras.getText().toString();






            }
        });


    }

    private void inicilizarvistas() {
        btnletras = findViewById(R.id.btnletras);
        btnpalabras = findViewById(R.id.btnfrases);
        txtpalabras = findViewById(R.id.txtfrases);
    }

}