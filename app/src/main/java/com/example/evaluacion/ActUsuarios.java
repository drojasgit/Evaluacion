package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Esta clase representa la actividad del perfil del usuario
 * @author Diego Rojas
 * @version 1.0.0
 */
public class ActUsuarios extends AppCompatActivity {

    private TextView textNombre, textEdad;
    private String valorNombre, valorEdad;

    /**
     * Este método crea la actividad
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_usuarios);

        textNombre = (TextView)findViewById(R.id.tvNombre);
        textEdad = (TextView)findViewById(R.id.tvEdad);

        valorNombre = getIntent().getStringExtra("user");
        valorEdad = getIntent().getStringExtra("edad");
    }

    /**
     * Este método permite mostrar el nombre y la edad del usuario ingresada
     * @param view
     */
    public void mostrarDatosUsuario(View view)
    {
        textNombre.setText(valorNombre);
        textEdad.setText(valorEdad);
    }
}
