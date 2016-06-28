package mumencos.trivia;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnJugar = (ImageButton)findViewById(R.id.btnJugar);
        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NivelActivty.class);
                startActivity(intent);
            }
        });
        ImageButton btnAcerca = (ImageButton)findViewById(R.id.btnAcerca);
        btnAcerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AcercaDe.class);
                startActivity(intent);
            }
        });
        ImageButton btnTutorial = (ImageButton)findViewById(R.id.btnTutorial);
        btnTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tutorial.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}
