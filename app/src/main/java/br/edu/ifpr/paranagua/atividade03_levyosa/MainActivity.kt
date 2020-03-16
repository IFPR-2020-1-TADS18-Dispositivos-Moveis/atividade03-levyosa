package br.edu.ifpr.paranagua.atividade03_levyosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_athelstan.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btBjorn
import kotlinx.android.synthetic.main.activity_main.btRagnar

class MainActivity : AppCompatActivity() {
    var bundle = Bundle()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bundleName()
        setOnClickListeners()
    }

    fun setOnClickListeners() {
        btAthelstan.setOnClickListener {
            startActivity(Intent(this, AthelstanActivity::class.java).putExtras(bundle))
        }
        btBjorn.setOnClickListener {
            startActivity(Intent(this, BjornActivity::class.java).putExtras(bundle))
        }
        btFloki.setOnClickListener {
            startActivity(Intent(this, FlokiActivity::class.java).putExtras(bundle))
        }
        btLagertha.setOnClickListener {
            startActivity(Intent(this, LagerthaActivity::class.java).putExtras(bundle))
        }
        btRagnar.setOnClickListener {
            startActivity(Intent(this, RagnarActivity::class.java).putExtras(bundle))
        }
        btRollo.setOnClickListener {
            startActivity(Intent(this, RolloActivity::class.java).putExtras(bundle))
        }
    }

    fun bundleName() {

        bundle.putString("activity", this.localClassName)

    }

}
