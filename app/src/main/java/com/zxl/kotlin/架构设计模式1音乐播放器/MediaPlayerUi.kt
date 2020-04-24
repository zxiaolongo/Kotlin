package com.zxl.kotlin.架构设计模式1音乐播放器

//代理uiView  kotlin叫委托
//by 子句表示，将 uiView 保存在 Derived 的对象实例内部，
// 而且编译器将会生成继承自 UiView 接口的所有方法, 并将调用转发给 uiView。
class MediaPlayerUi(uiView: UiView):UiView by uiView