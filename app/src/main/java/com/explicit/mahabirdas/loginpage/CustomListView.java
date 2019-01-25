package com.explicit.mahabirdas.loginpage;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListView extends ArrayAdapter<String> {

    private String[] list_Value;
    private String[] decs;
    private Integer[] imaId;
    private Activity context;
    public CustomListView(Activity context, String[] list_Value,String[] decs,Integer[] imaId) {
        super(context, R.layout.imagelist,list_Value);

        this.context=context;
        this.list_Value=list_Value;
        this.decs=decs;
        this.imaId=imaId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r=convertView;
        viewHolder home=null;
        if(r==null)
        {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.imagelist,null,true);
            home=new viewHolder(r);
            r.setTag(home);
        }
        else
              {
                  home= (viewHolder) r.getTag();
              }
              home.imvw.setImageResource(imaId[position]);

              home.tw1.setText(list_Value[position]);
              home.tw2.setText(decs[position]);
              return r;
    }

    class viewHolder{

        TextView tw1;
        TextView tw2;
        ImageView imvw;

        viewHolder(View v){
            tw1=(TextView) v.findViewById(R.id.Text_Bold);
            tw2=(TextView) v.findViewById(R.id.Text_Down);
            imvw=(ImageView) v.findViewById(R.id.Image_List);
        }
    }
}
