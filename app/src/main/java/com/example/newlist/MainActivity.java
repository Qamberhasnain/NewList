package com.example.newlist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String names[] = new String[] {"google","facebook","instagram","linkedin"};
    int id[]={R.drawable.google,R.drawable.facebook,R.drawable.instagram,R.drawable.linkedin};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        AutoCompleteTextView inputText = findViewById(R.id.tv1);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,names);
        //inputText.setAdapter(adapter);
        MainActivity2 obj = new MainActivity2(MainActivity.this,names,id);
        listView.setAdapter(obj);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Toast.makeText(MainActivity.this, "You Clicked on Google!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.google.com/"));
                    startActivity(intent);
                }
                if(position == 1) {
                    Toast.makeText(MainActivity.this, "You Clicked on Facebook!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.facebook.com/"));
                    startActivity(intent);
                }
                if(position == 2) {
                    Toast.makeText(MainActivity.this, "You Clicked on Instagram!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.instagram.com/"));
                    startActivity(intent);
                }
                if(position == 3) {
                    Toast.makeText(MainActivity.this, "You Clicked on LinkedIn!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://in.linkedin.com/"));
                    startActivity(intent);
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menulist1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.item1){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://about.google/"));
            startActivity(intent);
        }
        if(id == R.id.item2){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://about.facebook.com/"));
            startActivity(intent);
        }
        if(id == R.id.item3){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://about.instagram.com/"));
            startActivity(intent);
        }
        if(id == R.id.item4){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://about.linkedin.com/"));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}