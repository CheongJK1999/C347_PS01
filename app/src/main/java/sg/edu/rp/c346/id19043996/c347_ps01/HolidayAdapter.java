package sg.edu.rp.c346.id19043996.c347_ps01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<HolidayClass> {
    private ArrayList<HolidayClass> holiday;
    private Context context;
    private ImageView ivHoliday1;

    public HolidayAdapter(Context context, int resource, ArrayList<Food> objects){
        super(context, resource, objects);
        holiday = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tv = (TextView) rowView.findViewById(R.id.tv);
        // Get the ImageView object
        ivHoliday1 = (ImageView) rowView.findViewById(R.id.ivHol1);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Food currentFood = food.get(position);
        // Set the TextView to show the food

        tvFoodName.setText(currentFood.getName());
        // Set the image to star or nostar accordingly
        if(currentFood.isStar()) {
            ivStar.setImageResource(R.drawable.star);
        }
        else {
            ivStar.setImageResource(R.drawable.nostar);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }

}
