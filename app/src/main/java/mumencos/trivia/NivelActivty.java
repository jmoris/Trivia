package mumencos.trivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class NivelActivty extends AppCompatActivity {

    int nivel = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nivel);
        ImageButton btnNvl1 = (ImageButton)findViewById(R.id.imageButton4);
        btnNvl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nivel++;
                cambiarNivel();
            }
        });
    }

    void cambiarNivel()
    {
        switch(nivel)
        {
            case 1:
                ((ImageView)findViewById(R.id.imageView4)).setAlpha(1.0f);
                ((ImageView)findViewById(R.id.imageView3)).setAlpha(0f);
                ((ImageView)findViewById(R.id.imageView2)).setAlpha(0f);
                ((ImageView)findViewById(R.id.imageView)).setAlpha(0f);
                ((ImageButton)findViewById(R.id.imageButton4)).setBackgroundResource(R.drawable.medalla);
                break;
            case 2:
                ((ImageView)findViewById(R.id.imageView4)).setAlpha(0f);
                ((ImageView)findViewById(R.id.imageView3)).setAlpha(1.0f);
                ((ImageView)findViewById(R.id.imageView2)).setAlpha(0f);
                ((ImageView)findViewById(R.id.imageView)).setAlpha(0f);
                ((ImageButton)findViewById(R.id.imageButton3)).setBackgroundResource(R.drawable.medalla);
                break;
            case 3:
                ((ImageView)findViewById(R.id.imageView4)).setAlpha(0f);
                ((ImageView)findViewById(R.id.imageView3)).setAlpha(0f);
                ((ImageView)findViewById(R.id.imageView2)).setAlpha(1.0f);
                ((ImageView)findViewById(R.id.imageView)).setAlpha(0f);
                ((ImageButton)findViewById(R.id.imageButton2)).setBackgroundResource(R.drawable.medalla);
                break;
            case 4:
                ((ImageView)findViewById(R.id.imageView4)).setAlpha(0f);
                ((ImageView)findViewById(R.id.imageView3)).setAlpha(0f);
                ((ImageView)findViewById(R.id.imageView2)).setAlpha(0f);
                ((ImageView)findViewById(R.id.imageView)).setAlpha(1.0f);
                ((ImageButton)findViewById(R.id.imageButton)).setBackgroundResource(R.drawable.medalla);
                break;
        }
    }
}
