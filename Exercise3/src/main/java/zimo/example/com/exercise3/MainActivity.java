package zimo.example.com.exercise3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.buttonOK);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText)findViewById(R.id.editText);
                text.setText("button onClick");
            }
        });
    }
    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        TextView text = (TextView)findViewById(R.id.textView);
        switch (view.getId()){
            case R.id.checkBoxC:
                if (checked){
                    text.setText("C");
                }
                break;
            case R.id.checkBoxJava:
                if (checked){
                    text.setText("Java");
                }
                break;
            case R.id.checkBoxPytho:
                if (checked){
                    text.setText("Python");
                }
                break;
        }
    }
    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();
        TextView text = (TextView)findViewById(R.id.textView);
        switch (view.getId()){
            case R.id.radioFemale:
                if (checked){
                    text.setText("Female");
                }
                break;
            case R.id.radioMale:
                if (checked){
                    text.setText("Male");
                }
                break;
        }
    }
}
