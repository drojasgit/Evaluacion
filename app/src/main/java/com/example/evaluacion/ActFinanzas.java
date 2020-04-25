package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Esta clase representa una activity del apartado de finanzas de MontBike
 * @author Diego Rojas
 * @version 1.0.0
 */
public class ActFinanzas extends AppCompatActivity
{
    private EditText editPrecioBase, editCostoAtraso, editCantBici;
    private TextView textTotal;
    /**
     * Este método permite crear la activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_finanzas);

        editPrecioBase = (EditText)findViewById(R.id.etPrecioBase);
        editCostoAtraso = (EditText)findViewById(R.id.etCostoAtraso);
        editCantBici = (EditText)findViewById(R.id.etCantBici);
        textTotal = (TextView)findViewById(R.id.tvTotal);

        editCostoAtraso.setText("250");
    }

    /**
     * Verifica si se ingresaron valores numéricos
     * @return boolean
     */
    private boolean esNumerico(){
        boolean resultado;

        try{
            Integer.parseInt(editPrecioBase.getText().toString());
            Integer.parseInt(editCostoAtraso.getText().toString());
            Integer.parseInt(editCantBici.getText().toString());
            resultado = true;
        }
        catch(NumberFormatException e){
            resultado = false;
        }
        return resultado;
    }
    /**
     * Este método permite calcular el precio total de las bicicletas
     * @param view
     */
    public void calcularPrecioTotal(View view)
    {
        int precioBase, costoAtraso, cantBici, total;

        if (esNumerico()) {
            precioBase = Integer.parseInt(editPrecioBase.getText().toString());
            costoAtraso = Integer.parseInt(editCostoAtraso.getText().toString());
            cantBici = Integer.parseInt(editCantBici.getText().toString());

            total = (precioBase * cantBici) + costoAtraso;

            textTotal.setText("TOTAL = " + total);
        }
        else{
            textTotal.setText("Ingrese valores numéricos");
        }
    }
}
