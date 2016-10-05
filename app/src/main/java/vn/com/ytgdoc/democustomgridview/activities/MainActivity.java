package vn.com.ytgdoc.democustomgridview.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import vn.com.ytgdoc.democustomgridview.Adapter.CustomGirdview;
import vn.com.ytgdoc.democustomgridview.Model.Itemrow;
import vn.com.ytgdoc.democustomgridview.R;

public class MainActivity extends AppCompatActivity {
    private ImageView imgcus;
    private TextView lblcus;
    private CustomGirdview adapter;
    private List<Itemrow> itemrowList;
    private Itemrow itemrow;
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CallControl();
        CallCustomItemview();
    }

    private void CallCustomItemview() {
        itemrowList = new ArrayList<Itemrow>();
        itemrow = new Itemrow("Row 1",R.drawable.moi);
        itemrowList.add(itemrow);
        itemrow = new Itemrow("Row 2",R.drawable.binhmai);
        itemrowList.add(itemrow);
        itemrow = new Itemrow("Row 3",R.drawable.moi);
        itemrowList.add(itemrow);
        itemrow = new Itemrow("Row 4",R.drawable.binhmai);
        itemrowList.add(itemrow);
        itemrow = new Itemrow("Row 5",R.drawable.moi);
        itemrowList.add(itemrow);
        itemrow = new Itemrow("Row 6",R.drawable.binhmai);
        itemrowList.add(itemrow);
        //gan datasource vao adapter
        adapter = new CustomGirdview(this,itemrowList);
        //gan adapter vao gridview
        gridView.setAdapter(adapter);
    }

    private void CallControl() {
        imgcus = (ImageView) findViewById(R.id.imgcus);
        lblcus = (TextView) findViewById(R.id.lblcus);
        gridView = (GridView) findViewById(R.id.gridview);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"vi tri dang click"+position,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
