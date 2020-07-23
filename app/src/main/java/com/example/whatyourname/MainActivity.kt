package com.example.whatyourname

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Home"

        // kotlinの拡張機能入れれば宣言の必要がなくなる
//        val textView: TextView = findViewById(R.id.textView)
//        val editText: EditText = findViewById(R.id.editText)
//        val button: Button = findViewById(R.id.button)
//        val imageView: ImageView = findViewById(R.id.imageView)

//        button.setOnClickListener(this)
        button.setOnClickListener {
            // 画面遷移
            val intent: Intent = Intent(this, SubActivity::class.java)
            val name = editText.text.toString()
            // 遷移先に値を渡す
            intent.putExtra("name", name)
            startActivity(intent)
        }



    }

//    override fun onClick(v: View?) {
//        Log.d("text", editText.text.toString())
//        val name = editText.text.toString()
//        textView.text = name + "さん、こんにちは"
//        Log.d("text", textView.text.toString())
//    }
}
