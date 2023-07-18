package com.zallpy.listviewexample

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.zallpy.listviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ArrayAdapter<String>

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
        // Inicializando o adapter
        adapter = ArrayAdapter(this, R.layout.res_list_item)
        // A variável adapter precisou ser inicializada aqui neste bloco de código
        // devido a anoteção lateinit em sua criação (linha 13)
        // lembrando que o lateinit indica que a inicialização será feita antes do uso da variável porém, após a sua criação

        // Populando adapter
        val items = arrayOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
        adapter.addAll(*items)

        // Populando ListView com o Adapter
        binding.listView.adapter = adapter
    }
}