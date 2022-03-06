package com.example.redis.cache

import org.springframework.data.repository.CrudRepository

interface MemberRepository: CrudRepository<Member, String>