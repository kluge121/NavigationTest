package com.kakaopay.navigationtest.nav1


import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.get
import androidx.navigation.plusAssign
import com.kakaopay.navigationtest.R
import com.kakaopay.navigationtest.navInfalter
import kotlinx.android.synthetic.main.fragment_nav1_2.view.*
import kotlinx.android.synthetic.main.fragment_nav1_3.view.*

/**
 * A simple [Fragment] subclass.
 */
class Nav1Fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav1_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.nav1_3.setOnClickListener {
            findNavController().navigate(findNavController().graph[R.id.nav2Fragment2].id)

        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(this.javaClass.simpleName, "Attach")
    }

    override fun onStart() {
        super.onStart()
        Log.e(this.javaClass.simpleName, "Start")
    }

    override fun onResume() {
        super.onResume()
        Log.e(this.javaClass.simpleName, "Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(this.javaClass.simpleName, "Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(this.javaClass.simpleName, "Stop")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e(this.javaClass.simpleName, "Detach")
    }


}
