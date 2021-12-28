package com.api21.popupmenu

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.widget.PopupMenu
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val wrapper = ContextThemeWrapper(this, R.style.YOURSTYLE_PopupMenu)

        btnOptionMenu.setOnClickListener {
            val popupmenu = PopupMenu(wrapper, it)
            popupmenu.menu.setGroupDividerEnabled(true)
            popupmenu.menuInflater.inflate(R.menu.nav_menu,popupmenu.menu)
            popupmenu.show()

        }

    }
}