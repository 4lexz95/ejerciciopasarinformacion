package alex.example.ejerciciopasarinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.StringTokenizer;

public class Calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null){
            int boton = bundle.getInt("BOTON");
            String frase = bundle.getString("FRASE");
            switch (boton){
                case R.id.btnletras:
                    cuentaCaracteres(frase);
                    break;
                case R.id.btnfrases:
                    cuentaPalabras(frase);
                    break;

            }


        }
    }
    private void cuentaPalabras(String frase){
        StringTokenizer token = new StringTokenizer(frase);
        Toast.makeText(this, String.valueOf(token.countTokens())., Toast.LENGTH_SHORT).show();
        Toast.makeText(this, R.string.app_name , Toast.LENGTH_SHORT).show();

    }
    private void cuentaCaracteres(String frase){
        Toast.makeText(this, String.valueOf(frase.length()), Toast.LENGTH_SHORT).show();


    }

}