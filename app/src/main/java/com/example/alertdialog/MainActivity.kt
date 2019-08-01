package com.example.alertdialog

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
                    .setTitle("Background title")
                    .setMessage("Do you want to change background color to RED?")
                    .setPositiveButton("YES"){_, _ ->
                        Toast.makeText(this, "Background color set to RED", Toast.LENGTH_SHORT).show()
                        root_layout.setBackgroundColor(Color.RED)
                    }
                    .setNegativeButton("NO"){_, _ ->
                        Toast.makeText(this, "Background color wasn't changed", Toast.LENGTH_SHORT).show()
                    }
                    .setNeutralButton("Cancel"){_, _ ->
                        Toast.makeText(this, "Action canceled", Toast.LENGTH_SHORT).show()
                    }
                    .create()
            dialog.show()
        }
    }
}
