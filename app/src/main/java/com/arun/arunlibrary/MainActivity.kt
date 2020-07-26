package com.arun.arunlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.arun.basiccalculation.Calculate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClicked(view: View) {
        val resultPlus = Calculate.plus(10, 20)
        val resultMinus = Calculate.minus(10, 15)
        val resultDivide = Calculate.divide(12, 3)
        val resultMultiply = Calculate.multiply(2, 5)
        val resultFactorial = Calculate.factorial(4)

        val id = view.id

        when(id){
            R.id.btnPlus->{
                Toast.makeText(this, resultPlus.toString(), Toast.LENGTH_SHORT).show()
            }
            R.id.btnMinus->{
                Toast.makeText(this, resultMinus.toString(), Toast.LENGTH_SHORT).show()
            }
            R.id.btnDivide->{
                Toast.makeText(this, resultDivide.toString(), Toast.LENGTH_SHORT).show()
            }
            R.id.btnMultiply->{
                Toast.makeText(this, resultMultiply.toString(), Toast.LENGTH_SHORT).show()
            }
            R.id.btnFactorial->{
                Toast.makeText(this, resultFactorial.toString(), Toast.LENGTH_SHORT).show()
            }
            else->{
                Toast.makeText(this, "somthing wents wrong", Toast.LENGTH_SHORT).show()
            }
        }
 }
}