package cl.rodev.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saludar(View view) {
        Toast.makeText(this,"Hola!!",Toast.LENGTH_SHORT).show();
    }

    public String moduloValidacion(){

        return Validators.validation() + Validators.validation2();
    }



}
