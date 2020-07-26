package com.arun.basiccalculation

class Calculate {
    companion object {
        fun plus(a: Int, b: Int): Int {
            return a + b
        }

        fun minus(a: Int, b: Int): Int {
            return a - b
        }

        fun divide(a: Int, b: Int): Int {
               require(b!=0){"Divide by Zero Error"}

            return a / b
        }
        fun multiply(a: Int, b: Int): Int {
            return a * b
        }
        fun factorial(a: Int):Int{
            var total = 1
//            (1.rangeTo(a)).forEach {
//                total = total*it
//            }
            for (i in 1..a){
                total *= i
            }
            return total
        }

    }
}