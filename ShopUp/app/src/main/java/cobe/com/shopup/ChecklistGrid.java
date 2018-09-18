package cobe.com.shopup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cobe on 1.2.18..
 */

public class ChecklistGrid extends BaseAdapter{

    private Context mContext;
    private String[] web;
    private int[] Imageid;

    public ChecklistGrid(){

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return web.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.checklist_grid_single, null);
            TextView titleText = (TextView) grid.findViewById(R.id.titleText);
            TextView subtitleText = (TextView) grid.findViewById(R.id.subtitleText);

            ImageView bgImage = (ImageView)grid.findViewById(R.id.bgImage);
            ImageView maskImage = (ImageView)grid.findViewById(R.id.maskImage);

            titleText.setText(web[position]);
            bgImage.setImageResource(Imageid[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}
