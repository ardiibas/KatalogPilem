package gifood.id.katalogfilem.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import gifood.id.katalogfilem.R

class FragmentSetting : Fragment(){

    companion object {
        fun newInstance(): FragmentSetting {

            val fragmentSetting = FragmentSetting()
            val args = Bundle()

            fragmentSetting.arguments = args

            return fragmentSetting
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val  root = inflater.inflate(R.layout.fragment_setting, container, false)

        return root
    }
}