Kotlin Ktor Demo
================

Use [ktor](http://ktor.io) to write web server.

Run `Hello.kt` in your IDE, and open <http://localhost:8080> in your browser.

需要注意的坑
------

- 就算没有对gson进行任何配置，`gson {}`也需要写上，否则访问相关的url返回的是404，没有任何提示。提了一个Issue: <https://github.com/ktorio/ktor/issues/512>