package mumencos.trivia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial);
    }
    @Override
    public void onBackPressed() {
        finish();
    }
}
