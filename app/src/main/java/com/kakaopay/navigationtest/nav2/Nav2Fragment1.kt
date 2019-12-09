package com.kakaopay.navigationtest.nav2


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kakaopay.navigationtest.R
import kotlinx.android.synthetic.main.fragment_nav2_1.view.*

class Nav2Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav2_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.nav2_1.setOnClickListener {
            findNavController().navigate(R.id.action_nav2Fragment1_to_nav2Fragment2)
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
