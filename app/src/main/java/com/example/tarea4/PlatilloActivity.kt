package com.example.tarea4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_platillo.*

class PlatilloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_platillo)

        val tag = "com.example.tarea4.platillos.platillo"
        val id:String = intent.getStringExtra(tag)

        print(id)
        var model = Model(-1,"","", R.drawable.restaurante)

        when (id) {
            "0" -> model = Model(0,"Chiles en nogada", "El chile en nogada es uno de los platillos típicos de la gastronomía del estado de Puebla", R.drawable.chileenhogada)
            "1" -> model = Model(1,"Ensalada", "Un plato frío de varias verduras cortadas, mezcladas y aderezadas, fundamentalmente con sal, aceite vegetal y vinagre", R.drawable.ensaladas)
            "2" -> model = Model(2,"Pavo", "El pavo relleno es el principal protagonista de la cena de Acción de Gracias y, por ello, te enseñamos a cocinar la auténtica receta americana", R.drawable.pavo)
            "3" -> model = Model(3,"Pozole","El pozole es un plato tradicional mesoamericano, un caldo hecho a base de granos de maíz de un tipo conocido comúnmente como cacahuazintle, a la que se agrega, según la región, carne de pollo o de cerdo como ingrediente secundario", R.drawable.pozole)
            "4" -> model = Model(4,"Tacos","Es considerado como uno de los platillos más representativos de la comida mexicana\u200B\u200B." , R.drawable.taco)
        }
        tvPlatillo.text = model.nombre
        tvPlatilloDescripcion.text = model.descripcion
        imgPlatillo.setImageResource(model.thumbnail)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.manu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.mnuAcerca-> acercaDe()
            R.id.mnuFuerte-> platoFuerte()
            R.id.mnuEnsaladas-> ensalada()
            R.id.mnuBebidas-> bebidas()
            else -> super.onOptionsItemSelected(item)
        }

    }
    fun acercaDe():Boolean{
        val intent = Intent( this, RestauranteActivity::class.java)
        startActivity(intent)
        return true
    }
    fun platoFuerte():Boolean{
        val intent = Intent( this, PlatillosActivity::class.java)
        startActivity(intent)
        return true
    }
    fun ensalada():Boolean{
        return true
    }
    fun bebidas():Boolean{
        return true
    }
}
