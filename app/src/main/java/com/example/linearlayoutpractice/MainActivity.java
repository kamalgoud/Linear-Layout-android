package com.example.linearlayoutpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText pin;
    Button b;
    TextView t;
    EditText f;
    EditText l;
    EditText m;

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pin=findViewById(R.id.edpin);
        b=findViewById(R.id.btnsubmit);
        t=findViewById(R.id.tvans);
        f=findViewById(R.id.edf);
        l=findViewById(R.id.edl);
        m=findViewById(R.id.edm);

        lv=(ListView)findViewById(R.id.lview);

        ArrayList<String> al=new ArrayList<>();
        al.add("Apple");
        al.add("Banana");
        al.add("cat");
        al.add("dog");
        al.add("egg");
        al.add("fog");
        al.add("god");
        al.add("hope");
        al.add("iron");
        al.add("jet");
        al.add("kit");
        al.add("lemon");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,al);
        lv.setAdapter(arrayAdapter);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=pin.getText().toString();
                String fn=f.getText().toString();
                String ln=l.getText().toString();
                String em=m.getText().toString();

                if(s.equals("123") && !fn.equals("") && !ln.equals("") && !em.equals("")  ){
                    t.setText("Applied Successfully!");
                }
                else{
                    t.setText("Enter All fields correctly!");
                }
            }
        });
    }
}
