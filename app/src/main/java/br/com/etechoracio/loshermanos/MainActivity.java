package br.com.etechoracio.loshermanos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtChopp;
    EditText txtPizza;
    EditText txtRecheio;
    EditText txtPessoas;
    TextView lblConsumo2;
    TextView lblServico2;
    TextView lblTotal2;
    TextView lblPorpessoa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtChopp = findViewById(R.id.txtChopp);
        txtPizza = findViewById(R.id.txtPizza);
        txtRecheio = findViewById(R.id.txtRecheio);
        txtPessoas = findViewById(R.id.txtPessoas);
        lblConsumo2 = findViewById(R.id.lblConsumo2);
        lblServico2 = findViewById(R.id.lblServico2);
        lblTotal2 = findViewById(R.id.lblTotal2);
        lblPorpessoa2 = findViewById(R.id.lblPorpessoa2);
    }
    public void onCalcular(View view){
        int Chopp = Integer.parseInt(txtChopp.getText().toString());
        int Pizza = Integer.parseInt(txtPizza.getText().toString());
        int Recheio = Integer.parseInt(txtRecheio.getText().toString());
        int Pessoas = Integer.parseInt(txtPessoas.getText().toString());

        double buychopp = Chopp * 7.30;
        double buypizza = Pizza * 31.50;
        double buyRecheio = Recheio * 5.90;

        double Consumobuy = buychopp + buypizza + buyRecheio;
        double Servicobuy = Consumobuy / 10;
        double Totalbuy = Consumobuy + Servicobuy;
        int Porpessoabuy = (int) (Totalbuy / Pessoas);

        lblConsumo2.setText(String.valueOf(Consumobuy));
        lblServico2.setText(String.valueOf(Servicobuy));
        lblTotal2.setText(String.valueOf(Totalbuy));
        lblPorpessoa2.setText(String.valueOf(Porpessoabuy));
    }
}
