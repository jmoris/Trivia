package mumencos.trivia;

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

        ImageButton btnAcerca = (ImageButton)findViewById(R.id.btnAcerca);
        btnAcerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.acerca_de);
            }
        });
        ImageButton btnTutorial = (ImageButton)findViewById(R.id.btnTutorial);
        btnTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.tutorial);
            }
        });
    }
}
