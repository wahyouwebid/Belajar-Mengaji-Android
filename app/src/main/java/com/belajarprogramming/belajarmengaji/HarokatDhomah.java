package com.belajarprogramming.belajarmengaji;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HarokatDhomah extends Activity {
    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat_dhomah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        show = (ImageButton)findViewById(R.id.domah_u);
        hide = (ImageButton)findViewById(R.id.domah_bu);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TampilGambar.setVisibility(View.VISIBLE);

            }
        });

        hide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                TampilGambar.setVisibility(View.INVISIBLE);

            }
        });
        //Untuk Menambahkan Button Suara
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.u); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.bu);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.tu);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.su);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.ju);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.hu);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.khu);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.du);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.dzu);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.ru);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.zu);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.su);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.syu);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.shu);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.dhu);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.thu);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.dhu);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.uu);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.ghu);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.fu);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.qu);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.ku);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.lu);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.mu);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.nu);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.wu);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.huu);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.yu);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.domah_u); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.domah_bu);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.domah_tu);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.domah_tsu);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.domah_ju);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.domah_hu);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.domah_khu);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.domah_du);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.domah_dzu);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.domah_ru);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.domah_zu);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.domah_su);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.domah_syu);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.domah_shu);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.domah_dhu);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.domah_thu);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.domah_duu);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.domah_uu);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.domah_ghu);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.domah_fu);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.domah_qu);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.domah_ku);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.domah_lu);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.domah_mu);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.domah_nu);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.domah_wu);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.domah_huu);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.domah_yu);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_u);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domah_bu);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_tu);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_tsu);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_ju);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_hu);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_khu);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_du);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_dzu);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_ru);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_zu);
                TampilGambar.startAnimation(animScale);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // zTODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_su);
                TampilGambar.startAnimation(animScale);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_syu);
                TampilGambar.startAnimation(animScale);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_shu);
                TampilGambar.startAnimation(animScale);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_dhu);
                TampilGambar.startAnimation(animScale);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_thu);
                TampilGambar.startAnimation(animScale);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_ghu);
                TampilGambar.startAnimation(animScale);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_uu);
                TampilGambar.startAnimation(animScale);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_ghu);
                TampilGambar.startAnimation(animScale);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_fu);
                TampilGambar.startAnimation(animScale);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_qu);
                TampilGambar.startAnimation(animScale);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.pop_domahtain_ku);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_lu);
                TampilGambar.startAnimation(animScale);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_mu);
                TampilGambar.startAnimation(animScale);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_nu);
                TampilGambar.startAnimation(animScale);

                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_wu);
                TampilGambar.startAnimation(animScale);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_hu);
                TampilGambar.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_yu);
                TampilGambar.startAnimation(animScale);
                SuaraYa.start();
            }
        });

        //TOAS
        https://developer.android.com/guide/topics/ui/notifiers/toasts.html
        help = (ImageButton)findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast,
                        (ViewGroup) findViewById(R.id.toast_layout_root));

                TextView text = (TextView) layout.findViewById(R.id.text);
                text.setText("Dammah adalah harakat yang berbentuk wau kecil yang diletakan di atas suatu huruf hijaiyah untuk melambangkan fonem 'U' ");

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });
        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.back);
        next_button.setOnClickListener(new View.OnClickListener() {
            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent explicit_intent = new Intent(Belajar_Harokat_Dhomah.this,
                        Belajar_Harokat_1.class); //Tujuan Class
                startActivity(explicit_intent);
            }

        });

    }
}
