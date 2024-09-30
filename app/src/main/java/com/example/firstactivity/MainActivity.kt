package com.example.firstactivity

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn1:Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)

        btn1.setOnClickListener {
            /*
            // NavControllerを取得
            val navController = findNavController(R.id.fcv)

            // 画面遷移
            navController.navigate(R.id.action_firstFragment_to_secondFragment)
            */
            supportFragmentManager.beginTransaction()
                .replace(R.id.fcv,FirstFragment())
                .commit()


        }



        btn2.setOnClickListener {
            /*
            // NavControllerを取得
            val navController = findNavController(R.id.fcv)

            // 画面遷移
            navController.navigate(R.id.action_secondFragment_to_firstFragment)
            */
            supportFragmentManager.beginTransaction()
                .replace(R.id.fcv,SecondFragment())
                .commit()


        }


    }
}