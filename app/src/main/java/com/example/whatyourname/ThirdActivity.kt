package com.example.whatyourname

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class ThirdActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Third"
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            android.R.id.home -> finish()
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }

}