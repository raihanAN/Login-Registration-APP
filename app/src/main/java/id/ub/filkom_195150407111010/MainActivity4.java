package id.ub.filkom_195150407111010;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity2.EXTRA_TEXT);
        String number = intent.getStringExtra(MainActivity2.EXTRA_NUM);
        String text3 = intent.getStringExtra(MainActivity2.EXTRA_TEXT3);
        String text4 = intent.getStringExtra(MainActivity2.EXTRA_TEXT4);
        String text5 = intent.getStringExtra(MainActivity2.EXTRA_TEXT5);


        EditText message = (EditText) findViewById(R.id.message);
        EditText number2 = (EditText) findViewById(R.id.number);
        message.setText("NIM " + text + " Nomor HP " + number + " Nama " + text3 + " Alamat " + text4 + " Jenis tinggal " + text5);
        Button button = (Button) findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mobileNum = number2.getText().toString();
                String send = message.getText().toString();

                boolean installed = appinstalled("com.whatsapp");

                if (installed){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https:/api.whatsapp.com/send?phone="+"+62"+mobileNum + "&text=" + send));
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity4.this, "Whatsapp tidak diinstall", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private boolean appinstalled(String url) {
        PackageManager packageManager = getPackageManager();
        boolean app_installed;
        try {
            packageManager.getPackageInfo(url, PackageManager.GET_ACTIVITIES);
            app_installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            app_installed = false;
        }
        return app_installed;
    }
}