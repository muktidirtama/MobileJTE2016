package id.ac.unsyiah.elektro.mobile.praktikum20pin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


        public class ActivityKedua extends Activity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_kedua);

                Intent pesan = getIntent();
                String pesanStr = pesan.getStringExtra("msg");

                TextView txtLabel = (TextView) findViewById(R.id.textView);
                txtLabel.setText(pesanStr);
            }
        }



