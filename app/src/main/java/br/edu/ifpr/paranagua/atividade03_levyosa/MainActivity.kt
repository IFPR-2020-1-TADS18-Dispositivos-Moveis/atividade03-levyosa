package br.edu.ifpr.paranagua.atividade03_levyosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_athelstan.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btBjorn
import kotlinx.android.synthetic.main.activity_main.btRagnar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOnClickListeners()




    }

    fun setOnClickListeners(){
        btAthelstan.setOnClickListener{
            startActivity(Intent(this, AthelstanActivity::class.java))
        }
        btBjorn.setOnClickListener {
            startActivity(Intent(this, BjornActivity::class.java))
        }
        btFloki.setOnClickListener{
            startActivity(Intent(this,FlokiActivity::class.java))
        }
        btLagertha.setOnClickListener{
            startActivity(Intent(this,LagerthaActivity::class.java))
        }
        btRagnar.setOnClickListener{
            startActivity(Intent(this,RagnarActivity::class.java))
        }
        btRollo.setOnClickListener{
            startActivity(Intent(this,RolloActivity::class.java))
        }
    }

}
