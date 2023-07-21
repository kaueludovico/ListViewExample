package com.zallpy.listviewexample

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.zallpy.listviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ArrayAdapter<Items>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inicializando o binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // A variável binding precisou ser inicializada aqui neste bloco de código
        // devido a anoteção lateinit em sua criação (linha 12)
        // lembrando que o lateinit indica que a inicialização será feita antes do uso da variável porém, após a sua criação

        // Configurando conteúdo da visualização
        setContentView(binding.root)
        // set -> Settings
        // Content -> Conteúdo
        // View -> Tela/ Visualização
        // Aqui indicamos que o layout utilizado pelo binding vai ser o leyout raíz (root) da tela

        // Chamando função para popular nossa Lista
        populateListView()
    }


    private fun populateListView() {

        // Criando itens da lista
        val items = mutableListOf(
            Items(R.drawable.home, "Título 1", "Descrição 1"),
            Items(R.drawable.home, "Título 2", "Descrição 2")
        )

        // Inicializando e populando o adapter
        adapter = ItemAdapter(this, items)
        // A variável adapter precisou ser inicializada aqui neste bloco de código
        // devido a anoteção lateinit em sua criação (linha 13)
        // lembrando que o lateinit indica que a inicialização será feita antes do uso da variável porém, após a sua criação

        // Populando ListView com o Adapter
        binding.listView.adapter = adapter
    }
}