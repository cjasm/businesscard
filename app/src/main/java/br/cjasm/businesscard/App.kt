package br.cjasm.businesscard

import android.app.Application
import br.cjasm.businesscard.data.AppDatabase
import br.cjasm.businesscard.data.BusinessCardRepository

class App : Application() {

    val database by lazy { AppDatabase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}