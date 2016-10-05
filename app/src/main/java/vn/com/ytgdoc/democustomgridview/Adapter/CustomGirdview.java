package vn.com.ytgdoc.democustomgridview.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import vn.com.ytgdoc.democustomgridview.Model.Itemrow;
import vn.com.ytgdoc.democustomgridview.R;

/**
 * Created by ytgdoc on 10/5/2016.
 */

public class CustomGirdview extends BaseAdapter{
    private Context context;
    private List<Itemrow> itemrowList;

    public CustomGirdview() {
    }

    public CustomGirdview(Context context, List<Itemrow> itemrowList) {
        this.context = context;
        this.itemrowList = itemrowList;
    }
    private class ViewHolder{
        private TextView lblcus;
        private ImageView imgcus;
    }

    @Override
    public int getCount() {
        return itemrowList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemrowList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return itemrowList.indexOf(itemrowList.get(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        View rowView=convertView;
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null ){
            viewHolder=new ViewHolder();
            rowView=inflater.inflate(R.layout.itemrow,parent,false);
            viewHolder.imgcus = (ImageView) rowView.findViewById(R.id.imgcus);
            viewHolder.lblcus = (TextView) rowView.findViewById(R.id.lblcus);
            rowView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) rowView.getTag();
        }
        Itemrow item = itemrowList.get(position);
        viewHolder.imgcus.setImageResource(item.getImgcus());
        viewHolder.lblcus.setText(item.getLblcus());
        return rowView;
    }
}
