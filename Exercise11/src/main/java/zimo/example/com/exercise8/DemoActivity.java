package zimo.example.com.exercise8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        Button button = (Button)findViewById(R.id.buttonRe);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                String name = intent.getStringExtra("name");
                String psd = intent.getStringExtra("psd");
                intent.putExtra("result",name+psd);
                Toast.makeText(DemoActivity.this, "another" + name + psd, Toast.LENGTH_SHORT).show();
                setResult(0,intent);
                finish();
            }
        });
    }
}
