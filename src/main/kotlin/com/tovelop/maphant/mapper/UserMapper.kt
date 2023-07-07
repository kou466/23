package com.tovelop.maphant.mapper

import com.tovelop.maphant.dto.UserDTO
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface UserMapper {
    fun insertUser(user: UserDTO)
    fun countSameEmails(email: String): Int
    fun countSameNickName(nickName: String): Int
    fun countSamePhoneInt(phoneNum: String): Int
    fun readAllColumnVal(emails: List<String>): List<UserDTO>
    fun updateUserByEmail(id: Int)
}