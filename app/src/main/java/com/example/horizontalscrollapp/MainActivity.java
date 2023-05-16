package com.example.horizontalscrollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
button=(Button) findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
     //   Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
        Log.d("Badal","This button is working ");
    }
});
        // why my images are not showing ans: due to the big size of linear layout
        // why my button is not display , sol:constraint your  button with parent

    }
}