package ru.geekbrains.appstopwatch.view

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.geekbrains.appstopwatch.R
import ru.geekbrains.appstopwatch.model.Model
import ru.geekbrains.appstopwatch.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel = MainViewModel(Model())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_time)
        viewModel.liveData.observe(this, { textView.text = it })

        findViewById<Button>(R.id.button_start).setOnClickListener {
            viewModel.start()
        }
        findViewById<Button>(R.id.button_pause).setOnClickListener {
            viewModel.pause()
        }
        findViewById<Button>(R.id.button_stop).setOnClickListener {
            viewModel.stop()
        }
    }
}