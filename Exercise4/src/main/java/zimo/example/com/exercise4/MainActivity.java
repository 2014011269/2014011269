package zimo.example.com.exercise4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] name = {"1","2"};
        String[] classId = {"aa","bb"};
        String[] Id = {"aeaeadsf","lakfdg"};
        List<Map<String,Object>> items = new ArrayList<>();
        for (int i = 0;i<name.length;i++){
            Map<String,Object> item = new HashMap<>();
            item.put("name",name[i]);
            item.put("class",classId[i]);
            item.put("id",Id[i]);
            items.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(this,items,R.layout.items,
                new String[]{"name","class","id"},new int[]{R.id.textName,R.id.textClass,R.id.textId});
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
