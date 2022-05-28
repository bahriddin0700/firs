package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initview()

    }

    private fun initview() {
        binding.btnPlus.setOnClickListener {
            val number1 = binding.editOne.text.toString().trim()
            val number2 = binding.editTwo.text.toString().trim()

            if (isNotEmpty(number1, number2)) {
                val sum = add(number1.toInt(), number2.toInt())
                binding.textResult.text = sum
            }else {
                toast("Enter data")
            }
        }
        binding.btnMinus.setOnClickListener {
            val num1 = binding.editOne.text.toString().trim()
            val num2 = binding.editTwo.text.toString().trim()

            if (isNotEmpty(num1, num2)){
                val son = minus(num1.toInt(), num2.toInt())
                binding.textResult.text = son
            }else {
                toast("Enter number")
            }
        }
        binding.btnBol.setOnClickListener {
            val num1 = binding.editOne.text.toString().trim()
            val num2 = binding.editTwo.text.toString().trim()

            if (isNotEmpty(num1, num2)){
                val son = bolish(num1.toInt(), num2.toInt())
                binding.textResult.text = son
            }else {
                toast("Enter number")
            }
        }
        binding.btnKop.setOnClickListener {
            val num1 = binding.editOne.text.toString().trim()
            val num2 = binding.editTwo.text.toString().trim()

            if (isNotEmpty(num1, num2)){
                val son = kop(num1.toInt(), num2.toInt())
                binding.textResult.text = son
            }else {
                toast("Enter number")
            }
        }
        binding.btnRefresh.setOnClickListener {
            val nol = 0
            binding.textResult.text = nol.toString()
        }

    }



    private fun add(a: Int, b:Int): String {
        return (a + b).toString()
    }
    private fun minus(a: Int, b:Int):String{
        return (a - b).toString()
    }
    private fun kop(a: Int, b: Int): String{
        return (a * b).toString()
    }
    private fun bolish(a: Int, b: Int): String{
        return (a / b).toString()
    }

    private fun toast(text: String) {

        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

    private fun isNotEmpty(s1: String , s2: String): Boolean {
        return !(TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2))
    }

}


