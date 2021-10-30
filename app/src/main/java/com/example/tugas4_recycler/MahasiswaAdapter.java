package com.example.tugas4_recycler;

import android.graphics.ImageDecoder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends
        RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>{
    private ArrayList<Mahasiswa> dataList;
    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }
    public void onBindViewHolder(MahasiswaViewHolder holder, int
            position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtPesan.setText(dataList.get(position).getPesan());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class MahasiswaViewHolder extends
            RecyclerView.ViewHolder{
        private TextView txtNama, txtPesan;
        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtPesan = (TextView) itemView.findViewById(R.id.txt_pesan);
        }
    }
}
