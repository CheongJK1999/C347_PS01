package sg.edu.rp.c346.id19043996.c347_ps01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.time.Year;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvholiday;
    ArrayList<Year> al;
    ArrayAdapter<Year> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvholiday = findViewById(R.id.lvHoliday);
        al = new ArrayList<>();
        al.add(new Year("New Years Day"));

        aa = new HolidayAdapter(this, R.layout.row, al);
        lvholiday.setAdapter(aa);

        lvholiday.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, HolidayClass.class);
                intent.putExtra("Holiday", al.get(i).getHolidayImage());
                startActivity(intent);
            }
        });

    }
}
