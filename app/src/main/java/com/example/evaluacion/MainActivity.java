package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Esta clase representa la actividad principal que se comporta como login de MontBike
 * @author Diego Rojas
 * @version 1.0.0
 */
public class MainActivity extends AppCompatActivity
{
    private EditText editNombre, editContrasena;

    /**
     * Este método permite crear la actividad
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Capturar variables de los Plain Text de la actividad
        editNombre = (EditText)findViewById(R.id.etNombre);
        editContrasena = (EditText)findViewById(R.id.etContrasena);
    }

    /**
     * Esta clase permite validar el inicio de sesión
     * @param view
     */
    public void iniciarSesion(View view)
    {
        if (editNombre.getText().toString().equals("Alan") && editContrasena.getText().toString().equals("123"))
        {
            Intent intent = new Intent(this, ActMenu.class);
            intent.putExtra("titulo", "MONTBIKE");
            intent.putExtra("derechos", "Montbike todos los derechos reservados");
            intent.putExtra("nombre", editNombre.getText().toString());
            startActivity(intent);
        }
        else {
            editNombre.setText("El nombre o la contraseña son incorrectos.");
        }
    }

    /**
     * Este método permite cerrar la aplicación
     * @param view
     */
    public void salir(View view)
    {
        finish();
    }
}
