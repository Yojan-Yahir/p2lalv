package mx.edu.teoem.isc.p2lalv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Frm1 extends AppCompatActivity implements View.OnClickListener {
    Button btnsiguiente2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm1);
        btnsiguiente2=(Button)findViewById(R.id.btnsiguiente2);
        btnsiguiente2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent Frm2=new Intent(this,Frm2.class);
        startActivity(Frm2);
        finish();
    }
}
