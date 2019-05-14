package com.example.table_one;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
TextView name;
EditText internal,external;
ListView lview;

ArrayList<String>namelist=new ArrayList<>();
ArrayList<String>internallist=new ArrayList<>();
ArrayList<String>externallist=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lview = findViewById(R.id.listviewxml);

        namelist.add("NABIN ALLIAS");
        namelist.add("ADARSH NAIR");
        namelist.add("JIJO G OOMMEN JIJO G OOMMEN ");
        namelist.add("JUDE JOSEPH");

//        internallist.add("40");
//        internallist.add("40");
//        internallist.add("40");
//        internallist.add("40");
//
//        externallist.add("40");
//        externallist.add("40");
//        externallist.add("40");
//        externallist.add("40");

        adapter adp=new adapter();
        lview.setAdapter(adp);


    }

    class adapter extends BaseAdapter{

        @Override
        public int getCount() {
            return namelist.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater infl=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=infl.inflate(R.layout.marklist,null);

            name=convertView.findViewById(R.id.studentnamexml);
//            internal=convertView.findViewById(R.id.studentinternalmark);
//            external=convertView.findViewById(R.id.studentexternalmark);

            name.setText(namelist.get(position));
//            internal.setText(internallist.get(position));
//            external.setText(externallist.get(position));



            return convertView;
        }
    }
}
