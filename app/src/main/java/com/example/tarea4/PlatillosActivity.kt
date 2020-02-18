package com.example.tarea4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_platillos.*

class PlatillosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_platillos)

        recycler.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val models =ArrayList<Model>()

        models.add(Model(0,"Chiles en nogada", "El chile en nogada es uno de los platillos típicos de la gastronomía del estado de Puebla", R.drawable.chileenhogada))
        models.add(Model(1,"Ensalada", "Un plato frío de varias verduras cortadas, mezcladas y aderezadas, fundamentalmente con sal, aceite vegetal y vinagre", R.drawable.ensaladas))
        models.add(Model(2,"Pavo", "El pavo relleno es el principal protagonista de la cena de Acción de Gracias y, por ello, te enseñamos a cocinar la auténtica receta americana", R.drawable.pavo))
        models.add(Model(3,"Pozole","El pozole es un plato tradicional mesoamericano, un caldo hecho a base de granos de maíz de un tipo conocido comúnmente como cacahuazintle, a la que se agrega, según la región, carne de pollo o de cerdo como ingrediente secundario", R.drawable.pozole))
        models.add(Model(4,"Tacos","Es considerado como uno de los platillos más representativos de la comida mexicana\u200B\u200B." , R.drawable.taco))

        val adapter=AdapterModel(models)
        recycler.adapter = adapter
    }
}
