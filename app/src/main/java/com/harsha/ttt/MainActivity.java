package com.harsha.ttt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    TextView t01,t00,t02,t10,t12,t11,t20,t21,t22;
    Button reset;
    int xo=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t00=findViewById(R.id.t00);
        t01=findViewById(R.id.t01);
        t02=findViewById(R.id.t02);
        t10=findViewById(R.id.t10);
        t11=findViewById(R.id.t11);
        t12=findViewById(R.id.t12);
        t20=findViewById(R.id.t20);
        t21=findViewById(R.id.t21);
        t22=findViewById(R.id.t22);
        reset=findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t01.setText("");
                t00.setText("");
                t02.setText("");
                t10.setText("");
                t12.setText("");
                t11.setText("");
                t20.setText("");
                t21.setText("");
                t22.setText("");
                xo=1;
            }
        });
    }

    public void markIt(View view)
    {
        t00=findViewById(R.id.t00);
        t01=findViewById(R.id.t01);
        t02=findViewById(R.id.t02);
        t10=findViewById(R.id.t10);
        t11=findViewById(R.id.t11);
        t12=findViewById(R.id.t12);
        t20=findViewById(R.id.t20);
        t21=findViewById(R.id.t21);
        t22=findViewById(R.id.t22);
        int xoid=view.getId();
        TextView xotv=findViewById(xoid);
        switch(xo)
        {
            case 0:xotv.setText("O");
                   xo=1;
                   break;
            case 1:xotv.setText("X");
                   xo=0;
                   break;
        }
        if(t00.getText()==t01.getText() && t02.getText()==t01.getText() && t00.getText()!="" )
            Toast.makeText(getApplicationContext(),t00.getText()+" Is winner",Toast.LENGTH_SHORT).show();
        else if(t00.getText()==t10.getText() && t10.getText()==t20.getText() && t00.getText()!="" )
            Toast.makeText(getApplicationContext(),t00.getText()+" Is winner",Toast.LENGTH_SHORT).show();
        else if(t00.getText()==t11.getText() && t11.getText()==t22.getText() && t00.getText()!="" )
            Toast.makeText(getApplicationContext(),t00.getText()+" Is winner",Toast.LENGTH_SHORT).show();

        else if(t01.getText()==t11.getText() && t21.getText()==t11.getText() && t01.getText()!="" )
            Toast.makeText(getApplicationContext(),t01.getText()+" Is winner",Toast.LENGTH_SHORT).show();

        else if(t02.getText()==t12.getText() && t12.getText()==t22.getText() && t22.getText()!="" )
            Toast.makeText(getApplicationContext(),t22.getText()+" Is winner",Toast.LENGTH_SHORT).show();

        else if(t20.getText()==t11.getText() && t11.getText()==t02.getText() && t02.getText()!="" )
            Toast.makeText(getApplicationContext(),t02.getText()+" Is winner",Toast.LENGTH_SHORT).show();

        else if(t20.getText()==t21.getText() && t21.getText()==t22.getText() && t22.getText()!="" )
            Toast.makeText(getApplicationContext(),t22.getText()+" Is winner",Toast.LENGTH_SHORT).show();

        else if(t10.getText()==t11.getText() && t11.getText()==t12.getText() && t12.getText()!="" )
            Toast.makeText(getApplicationContext(),t12.getText()+" Is winner",Toast.LENGTH_SHORT).show();
    }

}
