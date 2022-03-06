package com.example.redis.cache

import org.springframework.data.redis.core.RedisHash
import javax.persistence.Id

@RedisHash(value = "member")
data class Member(
    @Id val id : String? = null,
    val name : String,
    val email : String,
    var age : Int? = 0
)
