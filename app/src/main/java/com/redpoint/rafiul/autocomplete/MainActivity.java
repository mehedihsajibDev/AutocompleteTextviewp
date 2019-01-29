package com.redpoint.rafiul.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView auto;
    EditText setvalue;
    EditText setvalue2;
    ArrayList<String> name=new ArrayList<>();
    ArrayList<String> id=new ArrayList<>();
    ArrayList<String> id2=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auto=(AutoCompleteTextView)findViewById(R.id.auto);
        setvalue=(EditText) findViewById(R.id.setvalue);
        setvalue2=(EditText) findViewById(R.id.setvalue2);

        setValue();

        ArrayAdapter<String> nameArray=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        auto.setThreshold(1);
        auto.setAdapter(nameArray);

        auto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item=(String)adapterView.getItemAtPosition(i);
                int position=-1;
                for(int x=0;x<name.size();x++){
                    if(name.get(x).equals(item)){
                        position=x;
                        break;
                    }
                }
                Toast.makeText(MainActivity.this,""+position, Toast.LENGTH_SHORT).show();
                setvalue.setText(id.get(position));
                setvalue2.setText(id2.get(position));
            }
        });
    }

    private void setValue() {
        name.add("Dhanmondi 32");
        id.add("23.7507847");
        id2.add("90.3660748");

        name.add("dhanmondi 7");
        id.add("23.7497467");
        id2.add("90.3537703");

        name.add("dhanmondi 15");
        id.add("23.7498374");
        id2.add("90.3537703");

        name.add("dhanmondi 8");
        id.add("23.7461405");
        id2.add("90.3756262");

        name.add("dhanmondi 9");
        id.add("23.7461601");
        id2.add("90.3756262");

        name.add("dhanmondi 27");
        id.add("23.7461844");
        id2.add("90.3690601");
        name.add("mohammadpur");
        id.add("23.7488214");
        id2.add("90.143968");
        name.add("Mirpur 10 Bus Stopage");
        id.add("23.8067457");
        id2.add("90.3677811");
        name.add("Mirpur 1");
        id.add("23.8103062");
        id2.add("90.3216033");
        name.add("Mirpur 2");
        id.add("23.8049833");
        id2.add("90.3612882");


    }


}
