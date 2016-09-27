package com.example.hoangquoc.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.hoangquoc.adapter.DescriptionAdapter;
import com.example.hoangquoc.model.Description;

import java.util.ArrayList;

public class AddItem extends AppCompatActivity {

    ArrayList<Description> listDe = new ArrayList<Description>();
    DescriptionAdapter descriptionAdapter = null;
    ListView lvDescription = null;
    TextView txtName,txtNotes;
    RadioGroup priGroup,staGroup;
    Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        addControls();
        addEvent();

}

    private void addEvent() {
        GotoSreenAddItem();

    }

    private void GotoSreenAddItem() {
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh2 = new Intent(AddItem.this, MainActivity.class);
                startActivity(mh2);
                xulyNhap();
            }


        });
    }

    private void xulyNhap() {

    }

    private void addControls() {
         txtName= (TextView) findViewById(R.id.editName);
         txtNotes= (TextView) findViewById(R.id.etxtNotes);
         priGroup = (RadioGroup) findViewById(R.id.priGroup);
         staGroup = (RadioGroup) findViewById(R.id.staGroup);
        lvDescription = (ListView) findViewById(R.id.lvDetail);
        btnSave = (Button) findViewById(R.id.btnSave);
         Description de = new Description();
        descriptionAdapter = new DescriptionAdapter(this,R.layout.activity_add_item,lvDescription);





        //lvDescription = (ListView) findViewById(R.id.lvDetail);
       // listDescription = new ArrayList<>();
        //  listDescription.add(Description.class.get)
    }
}
