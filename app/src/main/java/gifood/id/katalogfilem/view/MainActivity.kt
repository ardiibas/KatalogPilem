@file:Suppress("UNREACHABLE_CODE")

package gifood.id.katalogfilem.view

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import gifood.id.katalogfilem.R
import gifood.id.katalogfilem.fragment.FragmentHome
import gifood.id.katalogfilem.fragment.FragmentSearch
import gifood.id.katalogfilem.fragment.FragmentSetting

class MainActivity : AppCompatActivity() {

    private var content: FrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        content = findViewById(R.id.main_frame)

        val bottomNavigationView = findViewById<View>(R.id.main_bottom_nav) as BottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val fragment = FragmentHome.Companion.newInstance()
        addFragment(fragment)
    }

    @SuppressLint("PrivateResource")
    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
                .replace(R.id.main_frame, fragment, fragment.javaClass.simpleName)
                .addToBackStack(fragment.javaClass.simpleName)
                .commit()
    }

    private val mOnNavigationItemSelectedListener = object : BottomNavigationView.OnNavigationItemSelectedListener {

        override fun onNavigationItemSelected(item: MenuItem): Boolean {

            when (item.itemId) {

                R.id.menu_home ->{
                    // Action when tab 1 selected
                    val fragment = FragmentHome.Companion.newInstance()
                    addFragment(fragment)

                    Toast.makeText(this@MainActivity, "Home", Toast.LENGTH_SHORT).show()

                    return true
                }

                R.id.menu_search ->{
                    // Action when tab 2 selected
                    val fragment = FragmentSearch.Companion.newInstance()
                    addFragment(fragment)

                    Toast.makeText(this@MainActivity, "Search", Toast.LENGTH_SHORT).show()

                    return true
                }

                R.id.menu_setting ->{
                    // Action when tab 3 selected
                    val fragment = FragmentSetting.Companion.newInstance()
                    addFragment(fragment)

                    Toast.makeText(this@MainActivity, "Setting", Toast.LENGTH_SHORT).show()

                    return true
                }
            }

            return false
        }

    }
}
