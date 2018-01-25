package imastudio.id.co.androidwidget;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityCustomAlertDialog extends AppCompatActivity {

    Button btnShowCustomAlertDialog;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_custom_alertdialog);

        btnShowCustomAlertDialog = (Button)findViewById(R.id.btnShowCustomAlertDialog);
        btnShowCustomAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //custom alert dialog

                final Dialog dialog = new Dialog(context);
                //memanggil layout custom
                dialog.setContentView(R.layout.layout_custom);
                //mengatur title
                dialog.setTitle("Warning!");

                //memanggil button ok
                //dialog.findviewbyid ini maksdnya adalah memanggil id yang ada di layout custom
                Button btnOK = (Button)dialog.findViewById(R.id.btnOK);
                btnOK.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        //ketika di pencet OK maka alert dialog nya hilang
                        dialog.dismiss();

//                        Intent a1 = new Intent(getApplicationContext(), MainActivity.class);
//                        startActivity(a1);
                    }
                });

                //menampilkan dialog nya
                dialog.show();


            }
        });
    }
}
