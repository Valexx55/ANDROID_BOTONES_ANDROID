package val.com.botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lblMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*1ER EJEMPLO */


        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //lblMensaje = (TextView)findViewById(R.id.LblMensaje);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imgview);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }

    // public void botonTocado (View v)
    // {
    //  lblMensaje.setText(v.getClass().getCanonicalName());

    // }
    /*public void cambiarImagen(View boton)
    {
        Log.d("MIAPP", "Boton Tocado");
        int id_boton = boton.getId();
        if(id_boton == R.id.boton_android){
            Log.d("MIAPP", "TOCO ANDROID");
            ImageView img= (ImageView)findViewById(R.id.ImgFoto);
            img.setImageResource(R.drawable.ic_launcher);

        }else{
            Log.d("MIAPP", "TOCO APPLE");
            ImageView img= (ImageView)findViewById(R.id.ImgFoto);
            img.setImageResource(R.drawable.manzana);
        }

    }*/

    public void calcularImc(View v) {
        double altura = R.id.textoaltura;

        EditText textopeso = (EditText) findViewById(R.id.textopeso);
        String peso = textopeso.getText().toString();
        int peso_n = Integer.parseInt(peso);

        EditText textoaltura = (EditText) findViewById(R.id.textoaltura);
        String alturai = textoaltura.getText().toString();


       double altura_n = Double.parseDouble(alturai);

        double IMC = peso_n / (altura_n * altura_n);
        EditText resultado = (EditText) findViewById(R.id.resultado);
        resultado.setText(IMC + "");
        ImageView img= (ImageView)findViewById(R.id.image);
        if(IMC<16){

            img.setImageResource(R.drawable.debajo);
        }else if(IMC<18) {

            img.setImageResource(R.drawable.delgao);

        }else if(IMC<25){
                          img.setImageResource(R.drawable.normal);
        }else if(IMC<30){
                   img.setImageResource(R.drawable.gordo);
        }else{
                   img.setImageResource(R.drawable.obeso);
        }

    }

}
