package happyapps.ejercicio9_notificacionessencillas;

import android.app.Notification;
import android.icu.math.MathContext;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        num=(int)(Math.random()*100001);
        String cadena=String.valueOf(num);

        Toast notification=Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notification.show();
    }


    public void controlar(View view){
        String ValorIngresado = et1.getText().toString();
        int valor=Integer.parseInt(ValorIngresado);
        if (valor==num){
            Toast notification=Toast.makeText(this,"Muy bien recordaste el numero",Toast.LENGTH_LONG);
            notification.show();
        }else{
            Toast notification=Toast.makeText(this,"Lo siento no es el numero que mostre",Toast.LENGTH_LONG);
            notification.show();
        }
    }
}
