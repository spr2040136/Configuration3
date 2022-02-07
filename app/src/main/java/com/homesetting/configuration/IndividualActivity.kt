package com.homesetting.configuration

import android.R
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import com.homesetting.configuration.databinding.ActivityIndividualBinding


class IndividualActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIndividualBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIndividualBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    private lateinit var usernameInput: TextInputLayout
    private lateinit var userEditText: EditText
    private lateinit var passwordTextInput: TextInputLayout
    private lateinit var passwordEditText: EditText

    private fun setError() {
        if (userEditText.text.isEmpty()) {
            usernameInput.setError("メールアドレスを入力してください")
        }
        if (passwordEditText.text.isEmpty()) {
            passwordTextInput.setError("パスワードを入力してください")
        }
    }
}