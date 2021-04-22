package sg.edu.rp.c346.id19043996.c347_ps01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HolidayClass extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Holiday> al;
    HolidayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ListView lv = this.findViewById(R.id.lvHoliday);
        TextView tvYear = findViewById(R.id.tvDate);

        Intent intent = getIntent();
        String message = intent.getStringExtra("year");
        tvYear.setText(message);

        al = new ArrayList<Module>();
        al.add(new Module("C208", true));
        aa = new ModuleAdapter(this, R.layout.module_row, al);
        lv.setAdapter(aa);
    }
}
