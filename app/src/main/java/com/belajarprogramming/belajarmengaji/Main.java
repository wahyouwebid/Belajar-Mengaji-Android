package com.belajarprogramming.belajarmengaji;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Main extends Activity {
    ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer SuaraButton = MediaPlayer.create(this,R.raw.button);
        pindah =(ImageButton) findViewById(R.id.b_belajar);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SuaraButton.start();
                Intent IntenPindah = new Intent(Main.this,Belajar.class);
                startActivity(IntenPindah);
            }
        });

        /*Untuk Memanggil semua fitur yang ada di dalam menu belajar dan menu kuis*/

        pindah =(ImageButton) findViewById(R.id.b_kuis);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SuaraButton.start();
                Intent IntenPindah = new Intent(Main.this,Kuis.class);
                startActivity(IntenPindah);
            }
        });

        /*Untuk Memanggil semua fitur yang ada di dalam menu belajar dan menu kuis*/

        pindah =(ImageButton) findViewById(R.id.about);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SuaraButton.start();
                Intent IntenPindah = new Intent(Main.this,About.class);
                startActivity(IntenPindah);
            }
        });
    }
}
