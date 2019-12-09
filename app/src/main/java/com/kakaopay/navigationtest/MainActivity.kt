package com.kakaopay.navigationtest

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.NotificationManager.IMPORTANCE_LOW
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.findNavController
import androidx.navigation.plusAssign

class MainActivity : AppCompatActivity(), FragmentListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createNotificationChannel(this,IMPORTANCE_LOW,true,"Test1","test channel")

        findNavController(R.id.main_nav_host)
        findNavController(R.id.main_nav_host).graph.plusAssign(
            findNavController(R.id.main_nav_host).navInflater.inflate(
                R.navigation.navigation2
            )
        )
    }

    override fun loadNavGraph(graph: Int) {
        val pendingIntent = NavDeepLinkBuilder(this)
            .setGraph(R.navigation.navigation2)
            .setDestination(R.id.nav2Fragment3)
            .createPendingIntent()
    }

    private fun createNotificationChannel(
        context: Context, importance: Int, showBadge: Boolean,
        name: String, description: String
    ) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelId = "$name"
            val channel = NotificationChannel(channelId, name, importance)
            channel.description = description
            channel.setShowBadge(showBadge)

            val notificationManager = context.getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }
    }


}



