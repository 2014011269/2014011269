package zimo.example.com.exercise7;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.buttonMessage);
        Button button2 = (Button)findViewById(R.id.buttonLogin);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final  CharSequence[] items={"Item 1","Item 2","Item 3"};
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("dialog").setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, items[i], Toast.LENGTH_LONG).show();

                    }
                });
                builder.show();
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.login,null);
                builder.setView(dialogView).setTitle("Login")
                        .setPositiveButton(R.string.button3_name,new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                TextView text_userId = (TextView)dialogView.findViewById(R.id.editTextUserId);
                                TextView text_password = (TextView)dialogView.findViewById(R.id.editTextPassword);
//                        Toast.makeText(MainActivity.this,username.getText(),Toast.LENGTH_LONG);
                                String username = text_userId.getText() + "";
                                String password = text_password.getText() + "";
                                if (username.equals("abc") &&
                                        password.equals("123")){
                                    Toast.makeText(MainActivity.this,"222",Toast.LENGTH_LONG);
                                }else {
                                    Toast.makeText(MainActivity.this,"222",Toast.LENGTH_LONG);
                                }
                            }
                        })
                        .setNegativeButton(R.string.button4_name,new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                builder.show();
            }
        });
    }
}
