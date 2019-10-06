package mx.edu.teoem.isc.p2lalv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btns1);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent Frm1=new Intent(this,Frm1.class);
        startActivity(Frm1);
        finish();
    }
}
