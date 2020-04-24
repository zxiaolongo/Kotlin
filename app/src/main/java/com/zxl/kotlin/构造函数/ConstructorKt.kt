package com.zxl.kotlin.构造函数

import com.zxl.kotlin.BaseActivity
import com.zxl.kotlin.MainActivity

//直接写在类后面表示  主构造函数
//class 类名 constructor(形参1, 形参2, 形参3){}   主构造函数
//notice Primary Constructor而言，它的位置是在类的首部（class header）而不是在类体中（class body）。
//如果没有声明主构造函数会默认一个无参的主构造函数
class ConstructorKt constructor(var int: Int):BaseActivity() {
    //构造函数执行语句 init代码块    构造函数执行时执行
    //notice 关键字init：init{}它被称作是初始化代码块（Initializer Block），
    //notice 它的作用是为了Primary Constructor服务的
    init{

    }
}


//2. 写法二（演变一） 当constructor关键字没有注解和可见性修饰符作用于它时，constructor关键字可以省略
//如果有这些修饰时，是不能够省略的，并且constructor关键字位于修饰符后面
class ConstructorKt2(var int: Int):BaseActivity() {//***省略constructor
    init{

    }
}
//b. 初始化执行语句不是必须放置在init块中，我们可以在定义属性时直接将主构造器中的形参赋值给它。
class Person(username: String, age: Int){//***省去init
    private val username: String = username
    private var age: Int = age
}
//3. 写法三（演变二）：
//这种在构造器中声明形参，然后在属性定义进行赋值，这个过程实际上很繁琐，
// 有没有更加简便的方法呢？当然有，我们可以直接在Primary Constructor中定义类的属性。
class Person2(private val username: String, private var age: Int){}//****直接定义类的属性
//如果类不包含其他操作函数，那么连花括号也可以省略
class Person3(private val username: String, private var age: Int)