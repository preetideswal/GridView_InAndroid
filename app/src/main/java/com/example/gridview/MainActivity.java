package com.example.gridview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    TextView txt;
    String[] item={"Car","Android","Watch","Dresses","Gun","IPhone","Jacket","Pant","Wallpapers","Kurtis"};
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView)findViewById(R.id.text);
        GridView grid1=(GridView) findViewById(R.id.grid);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,item);
        grid1.setAdapter(adapter);
        grid1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                txt.setText(item[position]);
            }
        });
    }
}