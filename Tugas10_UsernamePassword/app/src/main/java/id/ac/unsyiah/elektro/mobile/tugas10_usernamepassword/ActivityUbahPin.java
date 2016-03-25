package id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class ActivityUbahPin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubahpin);

        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword", Context.MODE_PRIVATE);
        String user = sharedPreferences.getString("user", "ThugLife");
        EditText username = (EditText) findViewById(R.id.user2);
        username.setText(user);

    }

    public void onSimpan(View view){
        EditText ubah = (EditText) findViewById(R.id.user2);
        String username = ubah.getText().toString();

        EditText ubah2 = (EditText) findViewById(R.id.password2);
        String password = ubah2.getText().toString();


        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("user", username);
        editor.putString("pass", password);
        editor.apply();


        Intent pesan = new Intent(getApplicationContext(), MainActivity.class);
        pesan.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(pesan);

        finish();

    }
}
