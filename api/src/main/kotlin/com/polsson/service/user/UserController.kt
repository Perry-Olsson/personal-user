package com.polsson.service.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @GetMapping("/user")
    fun getUser(): String {
        return "your user"
    }
}
