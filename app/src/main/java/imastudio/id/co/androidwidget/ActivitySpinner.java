package imastudio.id.co.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivitySpinner extends AppCompatActivity {

    Spinner spData;
    String[] dataKategori = new String[]{
            "Automobile", "Bussiness Service", "Computer", "Education", "Personal",
            "Travel"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spData = (Spinner)findViewById(R.id.spinData);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
                dataKategori);
        spData.setAdapter(adapter);

        //aksi ketika spinner di pencet
        spData.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //mengambil nilai dari posisi dan dijadikan string
                String item = parent.getItemAtPosition(position).toString();
                //memunculkan toast
                Toast.makeText(getApplicationContext(), "Anda pilih : " + item,
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
