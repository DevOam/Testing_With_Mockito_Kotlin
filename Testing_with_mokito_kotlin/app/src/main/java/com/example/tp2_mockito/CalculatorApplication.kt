package com.example.tp2_mockito

class CalculatorApplication {
    private lateinit var calcService: CalculatorService
    fun setCalculatorService(calcService: CalculatorService) {
        this.calcService = calcService
    }

    fun add(input1: Double, input2: Double): Double {
        return calcService.add(input1, input2)
    }

    fun sous(input1: Double, input2: Double): Double {
        return calcService.sous(input1, input2)
    }

    fun multi(input1: Double, input2: Double): Double {
        return calcService.multi(input1, input2)
    }

    fun divi(input1: Double, input2: Double): Double {
        return calcService.divi(input1, input2)
    }
}