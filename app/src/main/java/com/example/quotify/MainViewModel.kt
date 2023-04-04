package com.example.quotify

import android.content.Context
import androidx.lifecycle.ViewModel
import com.google.gson.Gson

class MainViewModel(val context : Context): ViewModel() {
    var quoteList : Array<Quote> = emptyArray()
    var index : Int =0
    var listSize : Int?

    init {
        quoteList = updateQuoteList()
        listSize = quoteList.size
    }

    private fun updateQuoteList(): Array<Quote> {
        var inputStream = context.assets.open("quotes.json")
        val size = inputStream.available()
        var buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        return gson.fromJson(json,Array<Quote>::class.java)
    }

    fun getQuote() = quoteList[index]
    fun previousQuote() : Quote{
        index = index-1
        index =(index%(quoteList.size)+quoteList.size)%quoteList.size
        return quoteList[index]
    }
    fun nextQuote() : Quote {
        index = index+1
        index =(index%(quoteList.size)+quoteList.size)%quoteList.size
        return quoteList[index]
    }
}