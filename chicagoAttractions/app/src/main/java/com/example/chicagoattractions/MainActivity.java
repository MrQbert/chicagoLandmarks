package com.example.chicagoattractions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] name={"The Art Institute", "The Field Museaum", "LollaPalooza", "The Museaum of Science and Industry"};
    String[] nickname={"Art Nickname","Sue is here... I think?", "Do you like Music? I like Music", "Science.... cool I guess" };
    Integer[] imgid ={R.drawable.artinstitute, R.drawable.fieldmuseaum,R.drawable.lolla,R.drawable.msi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomListAdapter gust= new CustomListAdapter(this,name,nickname,imgid);
        list=findViewById(R.id.list);
        list.setEmptyView((findViewById(R.id.empty)));
        list.setAdapter(gust);
    }
}