package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.nossoRecicleView);

        List<Aluno> listAlunos = new ArrayList<>();
        Aluno huguinho = new Aluno();
        huguinho.setNome("huguinho");
        huguinho.setIdade(10);

        Aluno zezinho = new Aluno();
        zezinho.setNome("zezinho");
        zezinho.setIdade(9);

        Aluno luizinho = new Aluno();
        luizinho.setNome("luizinho");
        luizinho.setIdade(8);

        listAlunos.add(huguinho);
        listAlunos.add(zezinho);
        listAlunos.add(luizinho);

        recyclerView.setAdapter(new NossoRecicleViewListDeAlunosAdapter(listAlunos, this));

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

        int[] icones={R.mipmap.ic_launcher,R.mipmap.ic_launcher_foreground};
    }
}
