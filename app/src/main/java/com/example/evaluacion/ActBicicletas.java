package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Esta clase representa la actividad encargada de calcular el precio de las bicicletas
 * @author Diego Rojas
 * @version 1.0.0
 */
public class ActBicicletas extends AppCompatActivity
{
    private EditText editMarca, editAro;
    private TextView textResultado;
    /**
     * Este método se encarga de crear la actividad
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_bicicletas);

        editMarca = (EditText)findViewById(R.id.etMarca);
        editAro = (EditText)findViewById(R.id.etAro);
        textResultado = (TextView)findViewById(R.id.tvMensaje);

    }

    public void calcularCostoBicicleta(View view) {
        int bianchi = 40000, monark = 25000, aro16 = 2, aro20 = 4, resultado = 0;

        String marca = editMarca.getText().toString();
        String aro = editAro.getText().toString();

        if (marca.equalsIgnoreCase("BIANCHI") && aro.equals("16")) {
            resultado = bianchi * aro16;
            textResultado.setText("El resultado es: " + resultado);
        }
        else if (marca.equalsIgnoreCase("BIANCHI") && aro.equals("20")) {
            resultado = bianchi * aro20;
            textResultado.setText("El resultado es: " + resultado);
        }
        else if (marca.equalsIgnoreCase("MONARK") && aro.equals("16")){
            resultado = monark * aro16;
            textResultado.setText("El resultado es: " + resultado);
        }
        else if (marca.equalsIgnoreCase("MONARK") && aro.equals("20")) {
            resultado = monark * aro20;
            textResultado.setText("El resultado es: " + resultado);
        }
        else
        {
            textResultado.setText("Valores posibles en marca <BIANCHI, MONARK> y en aro <16, 20>");
        }
    }

}
