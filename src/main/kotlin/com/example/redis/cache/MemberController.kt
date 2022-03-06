package com.example.redis.cache

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/redis-test")
class MemberController(
    val memberRepository: MemberRepository
) {
    @GetMapping("members")
    fun getMembers(): List<Member>{
        val users = memberRepository.findAll()

        return users.toList()
    }

    @GetMapping("members/{id}")
    fun getMember(
        @PathVariable id : String
    ): Member{
        return memberRepository.findById(id).get()
    }

    @PostMapping("members")
    fun createMember(
        @RequestBody member: Member
    ){
        memberRepository.save(member)
    }
}