package gifood.id.katalogfilem.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.view.View
import android.widget.Toast
import gifood.id.katalogfilem.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<View>(R.id.main_bottom_nav) as BottomNavigationView

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {

                R.id.menu_home ->
                    // Action when tab 1 selected
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()

                R.id.menu_search ->
                    // Action when tab 2 selected
                    Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()

                R.id.menu_setting ->
                    // Action when tab 3 selected
                    Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show()
            }

            true
        }
    }
}
