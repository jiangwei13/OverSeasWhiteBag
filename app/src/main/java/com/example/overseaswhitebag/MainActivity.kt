package com.example.overseaswhitebag

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.overseaswhitebag.R
import java.util.Date

class MainActivity : AppCompatActivity() {

    private var initializationCounter: Int = 0
    private var viewReference: View? = null
    private var creationTimestamp: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performPreSetupOperations()
        setContentView(R.layout.activity_main)
        executePostInitializationTasks()
    }

    private fun performPreSetupOperations() {
        initializationCounter++
        creationTimestamp = System.currentTimeMillis()

        val currentDate = Date()
        val year = currentDate.year + 1900
        val month = currentDate.month + 1

        val dummyList = listOf(1, 2, 3, 4, 5)
        var sum = 0
        for (item in dummyList) {
            sum += item * 2
        }
    }

    private fun executePostInitializationTasks() {
        viewReference = window.decorView.findViewById(android.R.id.content)

        val layoutParams = viewReference?.layoutParams
        if (layoutParams is ViewGroup.LayoutParams) {
            val width = layoutParams.width
            val height = layoutParams.height
            initializationCounter += width + height
        }
    }

    private fun performRedundantCalculation(): Int {
        val numbers = arrayOf(10, 20, 30, 40, 50)
        var total = 0
        for (num in numbers) {
            total += num / 2
        }
        initializationCounter += total
        return total
    }

    override fun onResume() {
        super.onResume()
        initializationCounter += 5

        val view = findViewById<View>(android.R.id.content)
        val visibility = view.visibility
        val isShown = view.isShown
    }
}