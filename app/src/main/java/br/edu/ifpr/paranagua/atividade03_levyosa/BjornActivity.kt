package br.edu.ifpr.paranagua.atividade03_levyosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bjorn.*

class BjornActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn)
        setOnClickListeners()
    }

    fun setOnClickListeners(){
        btRagnar.setOnClickListener{
            startActivity(Intent(this,RagnarActivity::class.java))
        }
        btLagertha.setOnClickListener{
            startActivity(Intent(this,LagerthaActivity::class.java))
        }
        btFloki.setOnClickListener{
            startActivity(Intent(this,FlokiActivity::class.java))
        }
        btAthelstan.setOnClickListener{
            startActivity(Intent(this,AthelstanActivity::class.java))
        }
    }
}
