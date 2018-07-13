package gifood.id.katalogfilem.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import gifood.id.katalogfilem.R

class FragmentSearch : Fragment() {

    companion object {
        fun newInstance(): FragmentSearch {

            val fragmentSearch = FragmentSearch()
            val args = Bundle()

            fragmentSearch.arguments = args

            return fragmentSearch
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val  root = inflater.inflate(R.layout.fragment_search, container, false)

        return root
    }
}