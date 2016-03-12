package id.ac.unsyiah.elektro.mobile.praktikum17_counter;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;


public class ActivityKedua extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText(pesanStr);    }

}
