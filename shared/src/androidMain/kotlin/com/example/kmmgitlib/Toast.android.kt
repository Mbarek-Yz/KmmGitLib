package com.example.kmmgitlib

import android.content.Context
import android.util.Log
import android.widget.Toast

actual fun getToast(message: String, context: Any?) {
    if (context is Context) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    } else {
        // Handle the case where the context is not of the expected type
        Log.w("ModuleKmm","No Toast")
    }
}
