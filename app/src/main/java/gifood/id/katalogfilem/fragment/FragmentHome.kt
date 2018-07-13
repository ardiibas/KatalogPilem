package gifood.id.katalogfilem.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import gifood.id.katalogfilem.R

class FragmentHome : Fragment() {

    companion object {
        fun newInstance(): FragmentHome {

            val fragmentHome = FragmentHome()
            val args = Bundle()

            fragmentHome.arguments = args

            return fragmentHome
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val  root = inflater.inflate(R.layout.fragment_home, container, false)

        return root
    }
}