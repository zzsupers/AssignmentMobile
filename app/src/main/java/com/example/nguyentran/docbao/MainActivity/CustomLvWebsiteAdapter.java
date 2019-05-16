package com.example.nguyentran.docbao.MainActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nguyentran.docbao.R;
import com.example.nguyentran.docbao.MainActivity.WebSiteObject;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by nguyentran on 01/04/2019.
 */

public class CustomLvWebsiteAdapter extends ArrayAdapter<WebSiteObject>{
    public CustomLvWebsiteAdapter(Context context, int resourse, List<WebSiteObject> items) {
        super(context, resourse, items);

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi=LayoutInflater.from(getContext());
            v= vi.inflate(R.layout.custom__lv_website,null);
        }

        // Get item
        WebSiteObject webSiteObject = getItem(position);
        if (webSiteObject!=null) {
            TextView tenMenu = (TextView) v.findViewById(R.id.tv_tenMenu);
            tenMenu.setText(webSiteObject.tenMenu);

            ImageView iconMenu = (ImageView) v.findViewById(R.id.img_iconMenu);
            Picasso.with(getContext()).load(webSiteObject.image).into(iconMenu);


        }

        return v;
    }
}
