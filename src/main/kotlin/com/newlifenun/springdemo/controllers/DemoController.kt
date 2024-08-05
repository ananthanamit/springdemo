package com.newlifenun.springdemo.controllers

import com.newlifenun.springdemo.models.DemoData
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/v1")
class DemoController {

    @GetMapping("/Hello")
        fun hello(): String{
            return "Hello SpringBoot"
        }

    @GetMapping("/about")
    fun about(): String{
        return "About SpringBoot"
    }

    @GetMapping("/demodata")
    fun getDemodata():List<DemoData>{
        return listOf(
            DemoData(
                1,
                "John Doe",
                "john@email.com",
                "0812345678",
                "123 Main St."),
            DemoData(
                2,
                "Jane Doe",
                "Jane@email.com",
                "0812345678",
                "123 Main St."
            ),
        )

    }

    @GetMapping("/demodata/{id}")
    fun getDemodatabyid(@PathVariable id:Int): DemoData{
        return DemoData(
                1,
                "John Doe",
                "john@email.com",
                "0812345678",
                "123 Main St."
            )
    }

    @PostMapping("/demodata")
    fun createDemo(@RequestBody demodata: DemoData): DemoData{
        return demodata
    }

    @PutMapping("/demodata/{id}")
    fun updateDemodatabyid(@RequestBody demodata: DemoData, @PathVariable id:Int): DemoData{
        return demodata.copy(id=id)
    }

    @DeleteMapping("/demodata/{id}")
    fun deleteDemodatabyid(@PathVariable id:Int): String {
        return "Delete Demodata ID: $id"
    }
}
