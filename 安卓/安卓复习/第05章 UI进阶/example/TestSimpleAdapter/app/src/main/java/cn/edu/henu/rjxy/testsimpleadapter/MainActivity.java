package cn.edu.henu.rjxy.testsimpleadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String[] from = {"icon","title"};
    private int[] to = {R.id.iv_icon,R.id.tv_title};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.lv_main);
        SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.list_item,from,to);
        listView.setAdapter(adapter);
    }

    private List<Map<String,Object>> getData(){
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();

        map.put("icon",R.drawable.jd);
        map.put("title","京东商城");
        map.put("info", "no.1");

        list.add(map);

        map = new HashMap<>();
        map.put("icon",R.drawable.qq);
        map.put("title","QQ");
        map.put("info", "no.2");

        list.add(map);

        map = new HashMap<>();
        map.put("icon",R.drawable.qq_dizhu);
        map.put("title","QQ斗地主");
        map.put("info", "no.3");

        list.add(map);

        map = new HashMap<>();
        map.put("icon",R.drawable.sina);
        map.put("title","新浪微博");
        map.put("info","no.4");

        list.add(map);
        return list;
    }
}
