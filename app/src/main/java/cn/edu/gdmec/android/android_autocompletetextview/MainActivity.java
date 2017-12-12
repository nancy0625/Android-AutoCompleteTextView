package cn.edu.gdmec.android.android_autocompletetextview;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView textView;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        textView = (AutoCompleteTextView)this.findViewById(R.id.auto);
//        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,getDataSource());
//        textView.setAdapter(adapter);
        String[] countries = getResources().getStringArray(R.array.countries_array);
        //adapter = ArrayAdapter.createFromResource(this,android.R.layout.simple_expandable_list_item_1,countries);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,countries);
        textView.setAdapter(adapter);
    }
    public List<String> getDataSource(){
        List<String> list = new ArrayList<String>();
        list.add("Albania");
        list.add("Algeria");
        list.add("America");
        list.add("Andorra");
        list.add("Angola");
        list.add("Anguilla");
        list.add("Antarctica");
        return list;
    }
}
