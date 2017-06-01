package prax.com.binaryrpg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button exitBtn = (Button) findViewById(R.id.button);
        Button newBtn = (Button) findViewById(R.id.button2);
        Button conBtn = (Button) findViewById(R.id.button3);

        exitBtn.setOnClickListener(this);
        newBtn.setOnClickListener(this);
        conBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            //exit
            case R.id.button:
                finish();
                moveTaskToBack(true);

                break;

            //new game
            case R.id.button2:
                Intent gameIntent = new Intent(this, GameActivity.class);
                startActivity(gameIntent);
                break;

            //continue
            case R.id.button3:

                break;
        }
    }

}
