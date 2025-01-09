package androids.erikat.pruebamancala

import android.content.Intent
import android.os.Bundle
import androids.erikat.pruebamancala.databinding.ActivityNormasMancalaBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class NormasMancalaActivity : AppCompatActivity() {
    lateinit var mibiding: ActivityNormasMancalaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        iniciarComponentes()
    }

    fun iniciarComponentes() {
        mibiding = ActivityNormasMancalaBinding.inflate(layoutInflater)
        setContentView(mibiding.root)

        val btnVolver = mibiding.imageBtnVolver

        btnVolver.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}