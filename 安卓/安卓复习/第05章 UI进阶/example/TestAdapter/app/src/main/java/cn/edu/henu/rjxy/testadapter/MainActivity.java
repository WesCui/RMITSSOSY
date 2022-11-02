package cn.edu.henu.rjxy.testadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] names = {"京东商城","QQ","QQ斗地主","新浪微博"};
    private int[] icons = {R.drawable.jd,R.drawable.qq,R.drawable.qq_dizhu,R.drawable.sina};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyBaseAdapter myBaseAdapter = new MyBaseAdapter();
        ListView listView = (ListView)findViewById(R.id.lv_main);
        listView.setAdapter(myBaseAdapter);

    }

    class MyBaseAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return names[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder viewHolder;
            if(convertView == null){
                convertView = View.inflate(MainActivity.this,R.layout.list_view,null);
                viewHolder = new ViewHolder();
                viewHolder.imageView = (ImageView)convertView.findViewById(R.id.iv_image);
                viewHolder.textView = (TextView)convertView.findViewById(R.id.tv_list);
                convertView.setTag(viewHolder);
            }else{
                viewHolder = (ViewHolder)convertView.getTag();
            }

            viewHolder.imageView.setImageResource(icons[position]);
            viewHolder.textView.setText(names[position]);
            return convertView;
        }

        class ViewHolder{
            ImageView imageView;
            TextView textView;
        }
    }
}
