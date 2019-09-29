package com.example.firstseminakotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)



        joinButton.setOnClickListener {
            if (nameEditText.text.isEmpty() || idEditText.text.isEmpty() || passwordEditText.text.isEmpty() || passwordCheckEditText.text.isEmpty()){
                Toast.makeText(this,"빈칸 없이 작성해주세요",Toast.LENGTH_LONG).show()
            }else{
                if(passwordEditText.text.toString().equals(passwordCheckEditText.text.toString())){
                    Toast.makeText(this,"회원가입 되었습니다",Toast.LENGTH_LONG).show()
                    val intent = Intent()
                    intent.putExtra("idText",idEditText.text.toString())
                    intent.putExtra("passwordText",passwordEditText.text.toString())
                    setResult(Activity.RESULT_OK,intent)
                    finish()
                }else{
                    Toast.makeText(this,"비밀번호를 확인하세요",Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
