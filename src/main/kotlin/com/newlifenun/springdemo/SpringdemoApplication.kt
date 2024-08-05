package com.newlifenun.springdemo

import com.newlifenun.springdemo.controllers.DemoController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringdemoApplication

//class HelloController{
//	@GetMapping("/")
//	fun hello():String {
//		return "Hello Spring Boot!!"
//	}
//}

fun main(args: Array<String>) {
	runApplication<SpringdemoApplication>(*args)
}
