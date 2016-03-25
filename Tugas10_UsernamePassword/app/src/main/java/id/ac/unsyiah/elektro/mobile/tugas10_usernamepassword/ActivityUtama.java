package id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class ActivityUtama extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("kecap1");
        String user = pesan.getStringExtra("kecap2");

        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText(pesanStr + user);
    }

    public void onUbah(View view){
        Intent pesan = new Intent(getApplicationContext(), ActivityUbahPin.class);
        startActivity(pesan);
    }
}
