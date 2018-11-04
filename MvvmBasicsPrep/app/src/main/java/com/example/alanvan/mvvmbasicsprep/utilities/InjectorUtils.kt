package com.example.alanvan.mvvmbasicsprep.utilities

import com.example.alanvan.mvvmbasicsprep.data.FakeDatabase
import com.example.alanvan.mvvmbasicsprep.data.QuoteRepository
import com.example.alanvan.mvvmbasicsprep.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository =
            QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}