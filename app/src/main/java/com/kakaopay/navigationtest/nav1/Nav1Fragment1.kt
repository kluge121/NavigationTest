package com.kakaopay.navigationtest.nav1


import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.fragment.findNavController
import androidx.navigation.get
import androidx.navigation.navGraphViewModels
import com.kakaopay.navigationtest.MainActivity
import com.kakaopay.navigationtest.R
import kotlinx.android.synthetic.main.fragment_nav1_1.view.*


class Nav1Fragment1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav1_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.nav1_1.setOnClickListener {
            //            findNavController().navigate(Uri.parse("test://fragment2_2"))
            val intent = NavDeepLinkBuilder(requireContext())
                .setGraph(R.navigation.navigation2)
                .setDestination(R.id.nav2Fragment3)
                .setComponentName(MainActivity::class.java)
                .createPendingIntent()
            showNotification(intent)
        }
    }


    fun showNotification(pendingIntent: PendingIntent) {

        val builder = NotificationCompat.Builder(requireContext(), "Test1")
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setContentTitle("title")
            .setContentText("content")
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        NotificationManagerCompat.from(requireContext()).notify(R.string.noti1, builder.build())

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
