package com.example.dromeas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CommonLanding extends AppCompatActivity {

    Button notepad, camera, gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_landing);


        notepad= findViewById(R.id.notepad);
        camera= findViewById(R.id.camera);
        gallery= findViewById(R.id.gallery);

        notepad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommonLanding.this,ImportFromEditor.class);
                startActivity(intent);
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommonLanding.this,ImportFromCamera.class);
                startActivity(intent);
            }
        });


        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommonLanding.this,ImportFromGallery.class);
                startActivity(intent);
            }
        });
    }
}
