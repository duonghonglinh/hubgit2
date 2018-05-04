package com.example.admin.listviewnangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {

    //tao adapter co 3 bien

    private Context context;
    //bien hinh trong layout :dang layout nao
    private int layout;

    //LIST chua danh sach cac doi tuong trai cay
    private List<TraiCay> traiCayList;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }


    //so dong hien thi tren listView
    @Override
    public int getCount() {
        return traiCayList.size();
    }


    @Override
    public Object getItem(int position) {
        return null;
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // tao dong cho 1 view
        //lay context
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        //goi convertview de chua layout, layout o tren truyen vao
        convertView = inflater.inflate(layout,null);

        //anh xa view
        TextView txtTen = convertView.findViewById(R.id.tvTen);
        TextView txtMoTa = convertView.findViewById(R.id.tvMoTa);
        ImageView img = convertView.findViewById(R.id.imgHinh);


        // gan gia tri
        // tao doi tuong trai cay de hung lay doi tuong trai cay trong list
        TraiCay traiCay = traiCayList.get(position);

        //gan gia tri cho txt va hinh
        txtMoTa.setText(traiCay.getTen());
        txtTen.setText(traiCay.getMoTa());
        img.setImageResource(traiCay.getHinh());



        return convertView;
    }
}
