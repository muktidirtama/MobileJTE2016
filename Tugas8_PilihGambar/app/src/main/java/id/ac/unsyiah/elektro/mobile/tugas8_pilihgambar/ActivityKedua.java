package id.ac.unsyiah.elektro.mobile.tugas8_pilihgambar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        int posisi = pesan.getIntExtra("posisi", 0);

        ImageView tampil = (ImageView) findViewById(R.id.imageView);
        TextView tulis = (TextView) findViewById(R.id.textView);
        String [] nama={"","audi","bugatti","ferrari","koenigsegagera","toyota"};
        int [] gambar= {0,R.drawable.audi,R.drawable.bugatti,R.drawable.ferrari,R.drawable.koenigsegagera,R.drawable.toyota};

        tampil.setImageResource(gambar[posisi]);
        tulis.setText("Gambar Yang Anda Pilih Adalah "+nama[posisi]);
    }

}
