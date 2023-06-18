package ru.netology.nmedia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.ui.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val statsView = findViewById<StatsView>(R.id.stats)

        statsView.totalData = 2000F
        statsView.currentDataList = listOf(
            500F,
            500F,
            500F,
            500F,
        )


    }
}