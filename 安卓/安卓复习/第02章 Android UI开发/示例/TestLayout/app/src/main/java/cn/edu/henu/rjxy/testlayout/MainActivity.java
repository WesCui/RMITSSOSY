package cn.edu.henu.rjxy.testlayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_styles);

/*        // Get a reference to the AutoCompleteTextView in the layout
        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.autocomplete_country);
// Get the string array
        String[] countries = getResources().getStringArray(R.array.countries_array);
// Create the adapter and set it to the AutoCompleteTextView
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        textView.setAdapter(adapter);*/



    }

    public void sendMessage(View view){
        System.out.println("alarm............");
    }


    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox)view).isChecked();

        switch (view.getId()){
            case R.id.meat:
                if(checked){
                    System.out.println("you choosed meat.");
                } else{
                    System.out.println("you didn't choose meat.");
                }
                break;
            case  R.id.cheese:
                if(checked){
                    System.out.println("you choosed choose.");
                } else{
                    System.out.println("you didn't choose cheese.");
                }
                break;

        }
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.pirate:
                if(checked){
                    System.out.println("you choosed pirate.");
                }
                break;
            case  R.id.ninja:
                if(checked){
                    System.out.println("you choosed ninja.");
                }
                break;

        }
    }

    public void onToggleButton(View view){
        ToggleButton toggleButton = (ToggleButton)view;
        boolean checked = toggleButton.isChecked();
        if(checked){
            System.out.println("toggle button is on");
        }else{

            System.out.println("toggle button is off");
        }
    }

    public void onSwitch(View view){
        Switch sSwitch = (Switch)view;
        boolean checked = sSwitch.isChecked();

        if(checked){
            System.out.println("switch is on");
        }else{
            System.out.println("switch is off");
        }

    }


    public void toShowToast(View view){
/*        Context context = getApplicationContext();
        CharSequence text  = "hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast  = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,100,100);
        toast.show();*/

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,
                (ViewGroup) findViewById(R.id.toast_layout_root));

        TextView text = (TextView)layout.findViewById(R.id.text);
        text.setText("This is a custom toast");

        Toast toast  = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);

        toast.setView(layout);
        toast.show();
    }

}
