package id.ub.filkom_195150407111010;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity  {
    public static  final  String EXTRA_TEXT = "id.ub.filkom_195150407111010.EXTRA_TEXT";
    public static  final  String EXTRA_NUM = "id.ub.filkom_195150407111010.EXTRA_NUM";
    public static  final  String EXTRA_TEXT3 = "id.ub.filkom_195150407111010.EXTRA_TEXT3";
    public static  final  String EXTRA_TEXT4 = "id.ub.filkom_195150407111010.EXTRA_TEXT4";
    public static  final  String EXTRA_TEXT5 = "id.ub.filkom_195150407111010.EXTRA_TEXT5";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity3();
            }
        });

    }
    public void openMainActivity3(){
        EditText editText1 = (EditText) findViewById(R.id.Edit1);
        String text = editText1.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.Edit2);
        String number = editText2.getText().toString();
        EditText editText3 = (EditText) findViewById(R.id.Edit3);
        String text3 = editText3.getText().toString();
        EditText editText4 = (EditText) findViewById(R.id.Edit4);
        String text4 = editText4.getText().toString();
        EditText editText5 = (EditText) findViewById(R.id.Edit5);
        String text5 = editText5.getText().toString();

        Intent intent =new Intent(this, MainActivity3.class);
        Intent intent2 =new Intent(this, MainActivity4.class);
        intent2.putExtra(EXTRA_TEXT, text);
        intent2.putExtra(EXTRA_NUM, number);
        intent2.putExtra(EXTRA_TEXT3, text3);
        intent2.putExtra(EXTRA_TEXT4, text4);
        intent2.putExtra(EXTRA_TEXT5, text5);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_NUM, number);
        intent.putExtra(EXTRA_TEXT3, text3);
        intent.putExtra(EXTRA_TEXT4, text4);
        intent.putExtra(EXTRA_TEXT5, text5);
        startActivity(intent);

    }


}