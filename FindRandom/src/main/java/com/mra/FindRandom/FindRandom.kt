package com.mra.FindRandom

import androidx.annotation.Nullable
import java.io.IOException
import java.util.*
import kotlin.collections.ArrayList

class FindRandom() {

    var count = 0
    var repeat = false

    constructor(count: Int, repeat: Boolean) : this() {
        this.count = count;
        this.repeat = repeat;
    }


    @Throws(IOException::class)
    fun findFromInteger(from: Int, to: Int): ArrayList<Int> {

        val randomNumbers = ArrayList<Int>()

        if (to < from) throw IOException("The starting value is greater than the completion value - (from) is greater than (to)")

        if (to == from) throw IOException("The start value is equal to the finish value - (From) is equal to (to)")

        val numbers = ArrayList<Int>()
        for (i in from until to) {
            numbers.add(i)
        }
        if (!repeat && numbers.size < count) throw IOException("The numbers entered are less than the required random numbers")

        val rand = Random()

        for (i in 0 until count) {
            val randomIndex = rand.nextInt(numbers.size)
            val randomElement = numbers[randomIndex]
            randomNumbers.add(randomElement)
            if (!repeat) numbers.removeAt(randomIndex)
        }
        return randomNumbers
    }


    @Throws(IOException::class)
    fun findFromInteger(numbers: ArrayList<Int>): ArrayList<Int> {
        val randomNumbers = ArrayList<Int>()

        if (!repeat && numbers.size < count) throw IOException("The numbers entered are less than the required random numbers")

        val rand = Random()
        for (i in 0 until count) {
            val randomIndex = rand.nextInt(numbers.size)
            val randomElement = numbers[randomIndex]
            randomNumbers.add(randomElement)
            if (!repeat) numbers.removeAt(randomIndex)
        }
        return randomNumbers
    }

    @Throws(IOException::class)
    fun findFromString(strings: ArrayList<String>): ArrayList<String> {
        val randomStrings = ArrayList<String>()
        if (!repeat && strings.size < count) throw IOException("The numbers entered are less than the required random numbers")
        val rand = Random()
        for (i in 0 until count) {
            val randomIndex = rand.nextInt(strings.size)
            val randomElement = strings[randomIndex]
            randomStrings.add(randomElement)
            if (!repeat) strings.removeAt(randomIndex)
        }
        return randomStrings
    }


}