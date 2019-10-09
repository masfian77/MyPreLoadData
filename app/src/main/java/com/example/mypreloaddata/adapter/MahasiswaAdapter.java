package com.example.mypreloaddata.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mypreloaddata.R;
import com.example.mypreloaddata.model.MahasiswaModel;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaHolder> {

    private ArrayList<MahasiswaModel> listMahasiswa = new ArrayList<>();
    public MahasiswaAdapter() {
    }
    public void setData(ArrayList<MahasiswaModel> listMahasiswa) {
        if (listMahasiswa.size() > 0) {
            this.listMahasiswa.clear();
        }
        this.listMahasiswa.addAll(listMahasiswa);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MahasiswaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mahasiswa_row, viewGroup, false);
        return new MahasiswaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaHolder holder, int position) {
        holder.textViewNim.setText(listMahasiswa.get(position).getNim());
        holder.textViewNama.setText(listMahasiswa.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return listMahasiswa.size();
    }

    class MahasiswaHolder extends RecyclerView.ViewHolder {
        private TextView textViewNim;
        private TextView textViewNama;
        MahasiswaHolder(@NonNull View itemView) {
            super(itemView);
            textViewNim = itemView.findViewById(R.id.txt_nim);
            textViewNama = itemView.findViewById(R.id.txt_name);
        }
    }
}
