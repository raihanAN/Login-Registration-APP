package id.ub.filkom_195150407111010;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity2.EXTRA_TEXT);
        String number = intent.getStringExtra(MainActivity2.EXTRA_NUM);
        String text3 = intent.getStringExtra(MainActivity2.EXTRA_TEXT3);
        String text4 = intent.getStringExtra(MainActivity2.EXTRA_TEXT4);
        String text5 = intent.getStringExtra(MainActivity2.EXTRA_TEXT5);


        TextView textView1 = (TextView) findViewById(R.id.text1);
        textView1.setText(text);
        TextView textView2 = (TextView) findViewById(R.id.text2);
        textView2.setText(number);
        TextView textView3 = (TextView) findViewById(R.id.text3);
        textView3.setText(text3);
        TextView textView4 = (TextView) findViewById(R.id.text4);
        textView4.setText(text4);
        TextView textView5 = (TextView) findViewById(R.id.text7);
        textView5.setText(text5);

        Button button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity4();
            }
        });
    }

    private void openMainActivity4() {
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity2.EXTRA_TEXT);
        String number = intent.getStringExtra(MainActivity2.EXTRA_NUM);
        String text3 = intent.getStringExtra(MainActivity2.EXTRA_TEXT3);
        String text4 = intent.getStringExtra(MainActivity2.EXTRA_TEXT4);
        String text5 = intent.getStringExtra(MainActivity2.EXTRA_TEXT5);

        TextView textView1 = (TextView) findViewById(R.id.text1);
        textView1.setText(text);
        TextView textView2 = (TextView) findViewById(R.id.text2);
        textView2.setText(number);
        TextView textView3 = (TextView) findViewById(R.id.text3);
        textView3.setText(text3);
        TextView textView4 = (TextView) findViewById(R.id.text4);
        textView4.setText(text4);
        TextView textView5 = (TextView) findViewById(R.id.text7);
        textView5.setText(text5);
        Intent intent2 =new Intent(this, MainActivity4.class);
        intent2.putExtra(MainActivity2.EXTRA_TEXT, text);
        intent2.putExtra(MainActivity2.EXTRA_NUM, number);
        intent2.putExtra(MainActivity2.EXTRA_TEXT3, text3);
        intent2.putExtra(MainActivity2.EXTRA_TEXT4, text4);
        intent2.putExtra(MainActivity2.EXTRA_TEXT5, text5);
        startActivity(intent2);
    }
}