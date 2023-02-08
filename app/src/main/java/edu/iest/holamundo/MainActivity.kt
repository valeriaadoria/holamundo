package edu.iest.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var tvGreeting:TextView? = null ///Lateinit soloo para variables globales de vista

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   var tvGreeting: TextView
        setContentView(R.layout.activity_saludo)
        tvGreeting = findViewById(R.id.tvSaludo)
        cambiarmensaje()
        cambiarmensaje(2)
      //  tvGreeting.text = "Bienvenidos"
}

    private fun cambiarmensaje(){
         val mensaje_original:String
        mensaje_original = tvGreeting?.text.toString()
        Toast.makeText(this, "Tu mensaje original era " + mensaje_original + " :D", Toast.LENGTH_LONG).show()
    }

    private fun cambiarmensaje(tipo:Int){
        if(tipo==1){
            tvGreeting!!.text = getString(R.string.despedida)
        }else{
            Toast.makeText(this, "El tipo es $tipo", Toast.LENGTH_SHORT).show()  }
        }
    }