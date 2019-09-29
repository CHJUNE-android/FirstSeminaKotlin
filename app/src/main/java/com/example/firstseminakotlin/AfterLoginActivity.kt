package com.example.firstseminakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_after_login.*

class AfterLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_login)
        val intent = getIntent()
        idText.setText("환영합니다\n${intent.getStringExtra("idText")}님")
    }
}
