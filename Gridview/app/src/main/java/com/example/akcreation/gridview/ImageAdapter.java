package com.example.akcreation.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * Created by Ankita Jounjal on 27-07-2016.
 */
public class ImageAdapter extends BaseAdapter {
   private Context mContext;
    private final String[] text;
    private final int[] imageId;

    public ImageAdapter(Context c, String[] text, int[] imageId){
        mContext = c;
        this.imageId = imageId;
            this.text = text;
    }

    public int getCount(){
        return text.length;
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId(int position){
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View grid;
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid_single, null);
            TextView textView =(TextView)grid.findViewById(R.id.grid_text);
            ImageView imageView=(ImageView)grid.findViewById(R.id.grid_image);
            textView.setText(text[position]);
            imageView.setImageResource(imageId[position]);
        }
        else {
            grid = (View) convertView;
        }
        return grid;
    }
    private Integer[] imgIds = {
            R.drawable.ic_accessibility_black_24dp, R.drawable.ic_accessible_black_24dp,
            R.drawable.ic_account_balance_black_24dp, R.drawable.ic_account_balance_wallet_black_24dp,
            R.drawable.ic_account_box_black_24dp, R.drawable.ic_account_circle_black_24dp,
    };


}

