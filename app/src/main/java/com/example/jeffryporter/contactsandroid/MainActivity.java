package com.example.jeffryporter.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {

    ArrayAdapter<Contact> contacts;
    ListView list;
    EditText name;
    EditText phone;
    Button addButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);
        name = (EditText) findViewById(R.id.editText1);
        phone = (EditText) findViewById(R.id.editText2);
        addButton = (Button) findViewById(R.id.add);

        contacts = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1);
        list.setAdapter(contacts);

        addButton.setOnClickListener(this);
        list.setOnItemLongClickListener(this);

    }


    @Override
    public void onClick(View v)
    {
        if (!name.getText().toString().isEmpty() && !phone.getText().toString().isEmpty())
        {
            contacts.add(new Contact(name.getText().toString(), phone.getText().toString()));
            name.setText("");
            phone.setText("");
        }
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id)
    {
        Contact contact = contacts.getItem(position);
        contacts.remove(contact);
        return true;
    }
}
