package com.example.android.mivok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers2);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "Ek"));
        words.add(new Word("Two", "Do"));
        words.add(new Word("Three", "Teen"));
        words.add(new Word("Four", "Char"));
        words.add(new Word("Five", "Paach"));
        words.add(new Word("Six", "Cheeh"));
        words.add(new Word("Seven", "Saath"));
        words.add(new Word("Eight", "Aath"));
        words.add(new Word("Nine", "Noo"));
        words.add(new Word("Ten", "Das"));



//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
//
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);





    }
}