package kr.hs.emirim2109.mirim_0802_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    int[] posterId = {R.drawable.m1, R.drawable.m2, R.drawable.m3, R.drawable.m4, R.drawable.m5,
            R.drawable.m6, R.drawable.m7, R.drawable.m8, R.drawable.m9, R.drawable.m10};

    String[] items = {"조커", "나홀로 집에", "레옹", "크루엘라", "마션",
            "엔드게임", "파 프롬 홈", "가디언즈 오브 겔럭시", "캡틴마블", "블랙팬서"};
    ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv = findViewById(R.id.imgv);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                imgv.setImageResource(posterId[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}