package zimo.example.com.exercise17;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String sharedPreferencesFileName = "config";
    private static final String name = "name";
    private static final String Id = "id";
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = getSharedPreferences(sharedPreferencesFileName,MODE_PRIVATE);
        editor = preferences.edit();
        Button btuWrite = (Button)findViewById(R.id.btnWrite);
        Button btuRead = (Button)findViewById(R.id.btnRead);

        btuWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(name,"zz");
                editor.putInt(Id,1);
                editor.apply();
            }
        });

        btuRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = preferences.getString(name,null);
                int userId = preferences.getInt(Id,0);
                if (username != null){
                    Toast.makeText(MainActivity.this, "Id:" + userId + " name:" + username,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
