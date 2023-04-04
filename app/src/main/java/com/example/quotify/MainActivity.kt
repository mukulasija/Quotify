package com.example.quotify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel : MainViewModel
    private val quoteText : TextView
        get() = findViewById(R.id.quoteText)

    private val quoteAuthor : TextView
        get() = findViewById(R.id.quoteAuthor)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val quoteView : TextView = findViewById(R.id.quoteText)
        val quoteAuthor : TextView = findViewById(R.id.quoteAuthor)
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(application)).get(MainViewModel::class.java)
        setquote(mainViewModel.getQuote())

    }

    private fun setquote(quote: Quote) {
        quoteAuthor.text = quote.author
        quoteText.text = quote.text
    }

    fun onPrevious(view: View) {
        setquote(mainViewModel.previousQuote())
    }
    fun onNext(view: View) {
        setquote(mainViewModel.nextQuote())
    }

    fun onShare(view: View) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT,(mainViewModel.getQuote().text ?: "")+"\n~"+(mainViewModel.getQuote().author ?: ""))
        startActivity(intent)
    }

}