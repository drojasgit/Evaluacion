package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Esta clase representa el menú principal del usuario de MontBike
 * @author Diego Rojas
 * @version 1.0.0
 */
public class ActMenu extends AppCompatActivity
{
    private TextView textTitulo, textDerechos;
    private String valorNombre;
    /**
     * Este método permite crear la actividad
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_menu);

        textTitulo = (TextView)findViewById(R.id.tvTituloBici);
        textDerechos = (TextView)findViewById(R.id.tvDerechos);

        String valorTitulo = getIntent().getStringExtra("titulo");
        String valorDerechos = getIntent().getStringExtra("derechos");
        valorNombre = getIntent().getStringExtra("nombre");

        textTitulo.setText(valorTitulo);
        textDerechos.setText(valorDerechos);
    }

    /**
     * Este método permite cambiar a la vista de bicicletas
     * @param view
     */
    public void accederBicicletas(View view)
    {
        Intent intent = new Intent(this, ActBicicletas.class);
        startActivity(intent);
    }
    /**
     * Este método permite cambiar a la vista de usuarios
     * @param view
     */
    public void accederUsuarios(View view)
    {
        Intent intent = new Intent(this, ActUsuarios.class);
        intent.putExtra("user", "Nombre: " + valorNombre);
        intent.putExtra("edad", "Edad: 21 años");
        startActivity(intent);
    }
    public void accederFinanzas(View view)
    {
        Intent intent = new Intent(this, ActFinanzas.class);
        startActivity(intent);
    }
    /**
     * Este método permite salir de la aplicación
     * @param view
     */
    public void salir(View view)
    {
        finish();
    }
}
