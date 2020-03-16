package br.edu.ifpr.paranagua.atividade03_levyosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bjorn.*

class BjornActivity : AppCompatActivity() {
    var bundle = Bundle()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn)
        setSourceLabels()
        bundleName()
        setOnClickListeners()
    }

    fun setOnClickListeners(){
        btRagnar.setOnClickListener{
            startActivity(Intent(this,RagnarActivity::class.java).putExtras(bundle))
        }
        btLagertha.setOnClickListener{
            startActivity(Intent(this,LagerthaActivity::class.java).putExtras(bundle))
        }
        btFloki.setOnClickListener{
            startActivity(Intent(this,FlokiActivity::class.java).putExtras(bundle))
        }
        btAthelstan.setOnClickListener{
            startActivity(Intent(this,AthelstanActivity::class.java).putExtras(bundle))
        }
    }

    fun bundleName() {

        bundle.putString("activity", this.localClassName)

    }

    fun setSourceLabels(){
        tvSourceActivity.setText(intent.extras?.getString("activity"))
        tvThisActivity.setText(this.localClassName)
    }
}
