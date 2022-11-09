package com.fastcampus.issueservice.domain

enum class IssueType {

    BUG, TASK;

    companion object {
        //operator invoke 라는 함수를 사용하면 사용하는 쪽에서는 생성자를 사용하듯이 가능 IssueType("BUG")
        operator fun invoke(type: String) = valueOf(type.uppercase())
    }
}