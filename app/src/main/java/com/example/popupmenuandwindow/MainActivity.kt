package com.example.popupmenuandwindow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var btnShowPopUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowPopUp = findViewById(R.id.btn_show_popup)

        btnShowPopUp.setOnClickListener{
            //untuk pop up menu
//            val popup = PopupMenu(this,btnShowPopUp)
//            popup.inflate(R.menu.test)
//            popup.setOnMenuItemClickListener {
//                Toast.makeText(this,"Item : " + it.title,Toast.LENGTH_SHORT)
//                true
//            }
//            popup.show()

            //untuk pop up window
            val window = PopupWindow(this)
            val view = layoutInflater.inflate(R.layout.layout_popup,null)
            window.contentView = view
            val imageView = view.findViewById<ImageView>(R.id.imageView3)
            imageView.setOnClickListener{
                window.dismiss()
            }
            window.showAsDropDown(btnShowPopUp)
        }

    }
}