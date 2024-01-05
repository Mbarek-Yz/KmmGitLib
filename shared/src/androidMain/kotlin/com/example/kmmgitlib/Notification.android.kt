package com.example.kmmgitlib

import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

actual fun NotificationManager(title: String, message: String, context: Any?,drawble: Int) {
    if (context is Context) {
        val channelId = "default_channel_id"
        val notificationBuilder = NotificationCompat.Builder(context, channelId)
            .setContentTitle(title)
            .setContentText(message)
            .setSmallIcon(drawble) // Set a valid small icon here
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        val notificationManager = NotificationManagerCompat.from(context)
        notificationManager.notify(1, notificationBuilder.build())
    }
}
