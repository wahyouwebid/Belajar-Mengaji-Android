package com.belajarprogramming.belajarmengaji;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BelajarTanwin extends Activity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_tanwin);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer SuaraButton = MediaPlayer.create(this,R.raw.button);

        pindah =(ImageButton) findViewById(R.id.tanwin_dhomah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SuaraButton.start();
                Intent IntenPindah = new Intent(BelajarTanwin.this,TanwinDhomah.class);
                startActivity(IntenPindah);
            }
        });

        pindah =(ImageButton) findViewById(R.id.tanwin_kasroh);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SuaraButton.start();
                Intent IntenPindah = new Intent(BelajarTanwin.this,TanwinKasroh.class);
                startActivity(IntenPindah);
            }
        });

        pindah =(ImageButton) findViewById(R.id.tanwin_fathah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SuaraButton.start();
                Intent IntenPindah = new Intent(BelajarTanwin.this,TanwinFathah.class);
                startActivity(IntenPindah);
            }
        });
    }
}
