package com.explicit.mahabirdas.loginpage;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class slideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater mInflater;


    public int[] lst_images= {
            R.drawable.pizzab,
            R.drawable.burgerbig,
            R.drawable.salad,
            R.drawable.sncks,
            R.drawable.noodles,
            R.drawable.frenchfriesbig,
            R.drawable.tacosbig,
            R.drawable.paleodinnerrolls
    };
    //List of Titel
    public String[] lst_text= {
            "PIZZA",
            "BURGER",
            "SALAD",
            "SNACKS",
            "NOODLES",
            "FRENCH FRIES",
            "TACOS",
            "ROLL"
    };
    //List of Description


    public slideAdapter(Context context){
        this.context=context;
    }

    @Override
    public int getCount() {
        return lst_text.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view==(LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        mInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=mInflater.inflate(R.layout.slide,container,false);
        LinearLayout linearLayout=(LinearLayout) view.findViewById(R.id.slideLayout);
        ImageView imgView=(ImageView) view.findViewById(R.id.show_Image);
        TextView title=(TextView) view.findViewById(R.id.title_Text);
        //imgView.setImageResource(lst_images[position]);
        Glide.with(context).load(lst_images[position]).into(imgView);
        title.setText(lst_text[position]);
        container.addView(view);
        return view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
