package com.example.newlist;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends BaseAdapter {


        Context context;
        String arr[];
        int intarr[];

        public MainActivity2(Context con, String sar[], int inar[]){
            context = con;
            arr = sar;
            intarr = inar;
        }

        @Override
        public int getCount() {
            return arr.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.activity_main2,null);
            AutoCompleteTextView tv = convertView.findViewById(R.id.tv1);
            ImageView im = convertView.findViewById(R.id.img);

            tv.setText(arr[position]);
            im.setImageResource(intarr[position]);

            return convertView;
        }
    }
