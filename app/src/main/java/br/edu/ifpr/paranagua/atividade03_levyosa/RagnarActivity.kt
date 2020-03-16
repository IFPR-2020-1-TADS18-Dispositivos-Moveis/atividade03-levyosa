package br.edu.ifpr.paranagua.atividade03_levyosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ragnar.*

class RagnarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ragnar)
        setOnClickListeners()
    }

    fun setOnClickListeners(){

        btLagertha.setOnClickListener{
            startActivity(Intent(this, LagerthaActivity::class.java))
        }
        btFloki.setOnClickListener{
            startActivity(Intent(this,FlokiActivity::class.java))
        }
        btBjorn.setOnClickListener{
            startActivity(Intent(this,BjornActivity::class.java))
        }

    }
}
