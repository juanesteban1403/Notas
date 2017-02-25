package com.example.irisf.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText practicas,avance1,avance2,avance3,appfinal;
    Button calcular;
    TextView resultado;
    Double resultadoaux;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        practicas= (EditText)findViewById(R.id.practicas);
        avance3=(EditText)findViewById(R.id.avance3);
        avance2=(EditText)findViewById(R.id.avance2);
        avance1=(EditText)findViewById(R.id.avance1);
        appfinal=(EditText)findViewById(R.id.appfinal);
        calcular=(Button) findViewById(R.id.calcular);
        resultado=(TextView)findViewById(R.id.resultado);


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultadoaux=Double.parseDouble(practicas.getText().toString())*0.6;
                resultadoaux=resultadoaux+Double.parseDouble(avance1.getText().toString())*0.05;
                resultadoaux=resultadoaux+Double.parseDouble(avance2.getText().toString())*0.07;
                resultadoaux=resultadoaux+Double.parseDouble(avance3.getText().toString())*0.08;
                resultadoaux=resultadoaux+Double.parseDouble(appfinal.getText().toString())*0.2;
                if (0<resultadoaux && resultadoaux<1){
                    Toast.makeText(MainActivity.this, "Estás en el lugar equivocado bro", Toast.LENGTH_SHORT).show();
                }
                else if (1.1<resultadoaux && resultadoaux<2){
                    Toast.makeText(MainActivity.this, "Repaila perro", Toast.LENGTH_SHORT).show();
                }
                else if(2.1<resultadoaux && resultadoaux<3){
                    Toast.makeText(MainActivity.this, "Chao papá", Toast.LENGTH_SHORT).show();
                }
                else if (3.1<resultadoaux && resultadoaux<4){
                    Toast.makeText(MainActivity.this, "Normalito bro", Toast.LENGTH_SHORT).show();
                }
                else if (4.1<resultadoaux && resultadoaux<4.5){
                    Toast.makeText(MainActivity.this, "Túúú tranquilo", Toast.LENGTH_SHORT).show();
                }
                else if (4.6<resultadoaux && resultadoaux<5){
                    Toast.makeText(MainActivity.this, "Buena nerdo", Toast.LENGTH_SHORT).show();
                }
                resultado.setText(resultadoaux.toString());
            }
        });
    }
}
