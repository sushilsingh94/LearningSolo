package payu.android.sushil.com.payu_test;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();

        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String amount = intent.getStringExtra("amount");
        String backers = intent.getStringExtra("backers");

        TextView titleD = (TextView) findViewById(R.id.titleTxtD);
        TextView amountD = (TextView)findViewById(R.id.amountPledgedTxtD);
        TextView backersD = (TextView)findViewById(R.id.backersTxtD);

        titleD.setText(title);
        amountD.setText(amount);
        backersD.setText(backers);
    }
}
