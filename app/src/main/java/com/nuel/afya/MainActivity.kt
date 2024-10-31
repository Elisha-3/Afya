package com.nuel.afya

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        fetch the 6 cardviews
        val aboutcard = findViewById<CardView>(R.id.cardabout)
        val causescard = findViewById<CardView>(R.id.cardcauses)
        val symptomscard = findViewById<CardView>(R.id.cardsymptoms)
        val preventioncard = findViewById<CardView>(R.id.cardprevention)
        val tollfreecard = findViewById<CardView>(R.id.cardtollfree)
        val locationcard = findViewById<CardView>(R.id.cardlocation )

//        set on click listener to the cards
        aboutcard.setOnClickListener {
            startActivity(Intent(applicationContext, AboutActivity::class.java))

        }
//        end of about
        causescard.setOnClickListener {
            startActivity(Intent(applicationContext, CausesActivity::class.java))

        }
//        end of causes
        symptomscard.setOnClickListener {
            startActivity(Intent(applicationContext, SymptomsActivity::class.java))

        }
//        end of symptoms
        preventioncard.setOnClickListener {
            startActivity(Intent(applicationContext, PreventionActivity::class.java))

        }
//        end of prevention
        tollfreecard.setOnClickListener {
            startActivity(Intent(applicationContext, TollfreeActivity::class.java))

        }
//        end of toll_free
        locationcard.setOnClickListener {
            startActivity(Intent(applicationContext, LocationActivity::class.java))

        }
//        end of toll_free

    }
}