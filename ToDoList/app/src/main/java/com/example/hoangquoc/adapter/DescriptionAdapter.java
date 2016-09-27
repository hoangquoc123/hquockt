package com.example.hoangquoc.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.hoangquoc.model.Description;
import com.example.hoangquoc.todolist.R;

import java.util.List;

/**
 * Created by Hoang Quyen on 9/26/2016.
 */
public class DescriptionAdapter extends ArrayAdapter<Description>
{

    Activity context;
    int resource;
    List<Description> objects;
    public DescriptionAdapter(Activity context, int resource, List<Description> objects) {

        super(context, resource, objects);
        this.context=context;
        this.objects=objects;
        this.resource=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource,null);
        TextView txtName= (TextView) row.findViewById(R.id.editName);
        TextView txtNotes= (TextView) row.findViewById(R.id.etxtNotes);
        RadioButton rbtnLow = (RadioButton) row.findViewById(R.id.rbtnLow);
        RadioButton rbtnNoRmaL = (RadioButton) row.findViewById(R.id.rbtnNormal);
        RadioButton rbtnHigh = (RadioButton) row.findViewById(R.id.rbtnHigh);
        RadioButton rbtnTodo = (RadioButton) row.findViewById(R.id.rbtnToDo);
        RadioButton rbtnDone= (RadioButton) row.findViewById(R.id.rbtxDone);
        Button btnSave= (Button) row.findViewById(R.id.btnSave);

        Description description = this.objects.get(position);
        txtName.setText(description.getText());
        txtNotes.setText(description.getNotes());
        return row;
    }
}
