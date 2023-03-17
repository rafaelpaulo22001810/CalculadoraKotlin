package com.example.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.calculadorakotlin.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.button0.setOnClickListener {
            Log.i(TAG, "Click no botão 0")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "0"
            } else {
                binding.textVisor.append("0")
            }
        }

        binding.button1.setOnClickListener {
            Log.i(TAG, "Click no botão 1")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "1"
            } else {
                binding.textVisor.append("1")
            }
        }

        binding.button2.setOnClickListener {
            Log.i(TAG, "Click no botão 2")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "2"
            } else {
                binding.textVisor.append("2")
            }
        }

        binding.button3.setOnClickListener {
            Log.i(TAG, "Click no botão 3")
            if (binding.textVisor.text.toString() == "0") {
                binding.textVisor.text = "3"
            } else {
                binding.textVisor.append("3")
            }
        }

        binding.buttonAdition.setOnClickListener {
            Log.i(TAG, "Click no botão +")
            binding.textVisor.append("+")
        }

        binding.buttonEquals.setOnClickListener {
            Log.i(TAG, "Click no botão =")
            val expression = ExpressionBuilder(
                binding.textVisor.text.toString()
            ).build()
            binding.textVisor.text = expression.evaluate().toString()
            Log.i(TAG, "O resultado da expressão é ${binding.textVisor.text}")
        }

    }
}