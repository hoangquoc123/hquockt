package com.example.hoangquoc.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.hoangquoc.adapter.DescriptionAdapter;
import com.example.hoangquoc.model.Description;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnAdd;
    ListView lvDescription;
    ArrayList<Description> listDescription;
    DescriptionAdapter descriptionAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addControls();
        addEvent();
    }

    private void addEvent() {
        GotoSreenAddItem();

    }

    private void GotoSreenAddItem() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh2 = new Intent(MainActivity.this, AddItem.class);
                startActivity(mh2);
            }
        });
}

    private void addControls() {
        btnAdd = (Button) findViewById(R.id.btnAdd);
        lvDescription = (ListView) findViewById(R.id.lvDetail);
        listDescription = new ArrayList<>();
      //  listDescription.add(Description.class.get)
    }

}
