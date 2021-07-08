package com.example.pack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private val tvPackName by lazy { findViewById<TextView>(R.id.tv_pack_name) }
    private val tvAppName by lazy { findViewById<TextView>(R.id.tv_app_name) }
    private val tvFilePath by lazy { findViewById<TextView>(R.id.tv_file_path) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvPackName.text = packageName
        tvAppName.text = resources.getString(packageManager.getPackageInfo(packageName, 0).applicationInfo.labelRes)
        tvFilePath.text = javaClass.simpleName.lowercase(Locale.getDefault())
    }


}