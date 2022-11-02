package cn.edu.henu.rjxy.testarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.lv_main);
        String[] data = {"no.1","no.2","no.3","no.4"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.other_list_item,R.id.tv_title,data);
//        arrayAdapter.add("no.1");
//        arrayAdapter.add("no.2");
//        arrayAdapter.add("no.3");
        listView.setAdapter(arrayAdapter);

    }
}
