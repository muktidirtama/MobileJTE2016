package id.ac.unsyiah.elektro.mobile.praktikum18tebakangka;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;


public class ActivityKedua extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");
        TextView txtLabel = (TextView) findViewById(R.id.txtLabel);
        txtLabel.setText(pesanStr);
    }

}
