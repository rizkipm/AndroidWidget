package imastudio.id.co.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.Toast;

public class ActivityAnalogDanDigital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analog_dan_digital);
        // inititate the digital and analog clock
        DigitalClock simpleDigitalClock = (DigitalClock) findViewById(R.id.simpleDigitalClock);
        AnalogClock simpleAnalogClock = (AnalogClock) findViewById(R.id.simpleAnalogClock);
        // perform click event on analog clock
        simpleAnalogClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityAnalogDanDigital.this, "Analog Clock", Toast.LENGTH_SHORT).show(); // display a toast for analog clock
            }
        });
        // perform click event on digital clock
        simpleDigitalClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityAnalogDanDigital.this, "Digital Clock", Toast.LENGTH_SHORT).show(); //display a toast for digital clock
            }
        });
    }
}
