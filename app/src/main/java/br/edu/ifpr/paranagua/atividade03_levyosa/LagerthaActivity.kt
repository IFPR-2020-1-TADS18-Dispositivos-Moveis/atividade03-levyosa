package br.edu.ifpr.paranagua.atividade03_levyosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lagertha.*

class LagerthaActivity : AppCompatActivity() {
    var bundle = Bundle()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagertha)
        setSourceLabels()
        bundleName()
        setOnClickListeners()
    }

    fun setOnClickListeners(){
        btBjorn.setOnClickListener{
            startActivity(Intent(this,BjornActivity::class.java).putExtras(bundle))
        }
        btRagnar.setOnClickListener{
            startActivity(Intent(this,RagnarActivity::class.java).putExtras(bundle))
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
