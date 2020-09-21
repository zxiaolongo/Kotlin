package com.zxl.kotlin.委托

import kotlinx.coroutines.Dispatchers.Default
import kotlin.properties.ReadOnlyProperty
import kotlin.random.Random
import kotlin.reflect.KProperty

//9. 提供委托
class People {
    val name: String by DelegateProvider()
    val address: String by DelegateProvider()
}

class DelegateProvider {

    operator fun provideDelegate(thisRef: People, property: KProperty<*>): ReadOnlyProperty<People, String> {
        println("I'm in provideDelegate.")
        checkProperty()
        return RealDelegate()
    }
//operator fun provideDelegate(thisRef: T, property: KProperty<*>): RealOnlyProperty<T, R>
//operator fun provideDelegate(thisRef: T, property: KProperty<*>): ReadWriteProperty<T, R>
    private fun checkProperty() {
        val random = Random.Default
        if (!random.nextBoolean()) {
            throw RuntimeException("failed to create delegate.")
        }
    }
}

class RealDelegate : ReadOnlyProperty<People, String> {
    override fun getValue(thisRef: People, property: KProperty<*>): String {
        return "kotlin"
    }
}