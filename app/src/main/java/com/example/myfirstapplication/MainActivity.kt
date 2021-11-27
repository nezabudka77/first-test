package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="PoemActivity"
val poem= arrayOf("Мы – пешки, небо же – игрок.",
"То не мечта моя.",
"Исполнив всё, что предназначил рок,",
"На доске бытия,",
"Мы сходим тихо в темный гроб,",
"Покой там находя.")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, poem[0])
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, poem[1])
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, poem[2])
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, poem[3])
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, poem[4])
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, poem[5])
    }
}
