package br.edu.ifpr.paranagua.atividade03_levyosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lagertha.*

class LagerthaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagertha)
        setOnClickListeners()
    }

    fun setOnClickListeners(){
        btBjorn.setOnClickListener{
            startActivity(Intent(this,BjornActivity::class.java))
        }
        btRagnar.setOnClickListener{
            startActivity(Intent(this,RagnarActivity::class.java))
        }

    }
}
