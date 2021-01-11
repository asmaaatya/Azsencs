package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class Feedback extends AppCompatActivity {
     SharedPreferences preferences;
     SharedPreferences.Editor editor;
     JSONObject saved=new JSONObject();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Button button=findViewById(R.id.adbtn);
        Button button1=findViewById(R.id.clbtn);
        //Button button2=findViewById(R.id.removebtn);
        final EditText editText=findViewById(R.id.fdtext);
        init();
        Intent intent=getIntent();
        if(intent.getIntExtra("position",-1)!=-1){
            try{
                String feedback=editText.getText().toString();
                if(!preferences.getString("saved","").equals(""))
                    saved=new JSONObject(preferences.getString("saved",""));
                editText.setText(saved.getString("saved"+intent.getIntExtra("position",0)));
                feedback=saved.getString("saved"+intent.getIntExtra("position",0));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String feedback = editText.getText().toString();
                if (!feedback.equals("")) {
                    try {
                        if (!preferences.getString("saved", "").equals(""))
                            saved = new JSONObject(preferences.getString("saved", ""));
                        saved.put("saved"+ saved.length(), feedback);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    Log.d("testing",saved+"");
                    editor.putString("saved",saved.toString());
                    editor.apply();
                    editText.setText("");
                    Intent intent1=new Intent(getApplicationContext(),feedlist.class);
                    startActivity(intent1);
                    }
                }
            });
button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String feedback = editText.getText().toString();
        if(feedback.isEmpty()){
            Toast.makeText(getApplicationContext(),"Enter text",Toast.LENGTH_SHORT).show();
        }else {
            editText.setText("");
        }
    }
});
/*button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String feed=editText.getText().toString();
        editor.remove("saved");
        editor.apply();
        editText.setText("");
        Toast.makeText(getApplicationContext(),"Deleted",Toast.LENGTH_SHORT).show();
    }
});**/

    }

    private void init() {
        preferences=getSharedPreferences("text", Context.MODE_PRIVATE);
        editor=preferences.edit();
        Button button=findViewById(R.id.adbtn);
        Button button1=findViewById(R.id.clbtn);
        EditText editText=findViewById(R.id.fdtext);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.save) {
            if (preferences.getString("saved", "").equals("")) {
                Toast.makeText(getApplicationContext(), "Nothing to save", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent=new Intent(Feedback.this,feedlist.class);
                startActivity(intent);
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
