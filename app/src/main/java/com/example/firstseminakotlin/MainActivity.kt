package com.example.firstseminakotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.activity_sign_up.idEditText
import kotlinx.android.synthetic.main.activity_sign_up.joinButton
import kotlinx.android.synthetic.main.activity_sign_up.passwordEditText

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        loginButton.setOnClickListener{
            if(idEditText.text.isEmpty()||passwordEditText.text.isEmpty()){
                Toast.makeText(this,"빈칸 채워주세요",Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this@MainActivity,AfterLoginActivity::class.java)
                intent.putExtra("idText",idEditText.text.toString())
                startActivity(intent)

            }
        }
        joinButton.setOnClickListener{
            val intent = Intent(this@MainActivity,SignUpActivity::class.java)
            startActivityForResult(intent,100)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==100&&resultCode== Activity.RESULT_OK){
            idEditText.setText(data?.getStringExtra("idText"))
            passwordEditText.setText(data?.getStringExtra("passwordText"))
        }
    }
}
