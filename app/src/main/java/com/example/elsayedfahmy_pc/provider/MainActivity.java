package com.example.elsayedfahmy_pc.provider;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.marwatalaat.mal_provider.model.Contact;
import com.example.marwatalaat.mal_provider.model.ContactTable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saveUsingProvider(View v) {
    Contact contact = new Contact(1,"Mohamed","052566488","mohamed@yahoo.com");
        getContentResolver().insert(ContactTable.CONTENT_URI,ContactTable.getContentValues(contact,false));

    }

    public void ViewFromProvider(View v) {

        Cursor c = getContentResolver().query(ContactTable.CONTENT_URI, null, null, null, ContactTable.FIELD_COL_NAME);
        Contact con = ContactTable.getRow(c,true);

        Toast.makeText(MainActivity.this,con.getName(), Toast.LENGTH_SHORT).show();
    }
}
