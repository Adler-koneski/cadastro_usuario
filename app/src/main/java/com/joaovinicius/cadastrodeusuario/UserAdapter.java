package com.joaovinicius.cadastrodeusuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private List<String> ListaUsuario;

    public UserAdapter(List<String> lista){
        this.ListaUsuario = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position){
        String nome = ListaUsuario.get(position);
        holder.tvNome.setText(nome);
    }

    @Override
    public int getItemCount(){
        return ListaUsuario != null ? ListaUsuario.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvNome;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            tvNome = itemView.findViewById(android.R.id.text1);
        }
    }

}