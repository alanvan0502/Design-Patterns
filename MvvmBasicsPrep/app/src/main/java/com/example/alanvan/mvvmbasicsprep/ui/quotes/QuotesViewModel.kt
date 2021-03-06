package com.example.alanvan.mvvmbasicsprep.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.alanvan.mvvmbasicsprep.data.Quote
import com.example.alanvan.mvvmbasicsprep.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}
