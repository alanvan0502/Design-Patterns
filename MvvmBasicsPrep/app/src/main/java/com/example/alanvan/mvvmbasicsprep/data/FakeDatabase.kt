package com.example.alanvan.mvvmbasicsprep.data

// Private primary constructor inaccessible from other classes
class FakeDatabase private constructor() {

    // All the DAOs go here
    var quoteDao = FakeQuoteDao()
    private set

    companion object {
        @Volatile private var instance: FakeDatabase? = null

        fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: FakeDatabase().also { instance = it}
                }
    }
}