package com.tovelop.maphant.mapper

import com.tovelop.maphant.dto.UserDTO
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface AdminPageMapper {
    fun isAdmin(userDTO: UserDTO): Boolean
    fun setUserRole(role: String, id: Int)
    fun findBoardReport()
    fun setBoardSanction(boardId: Int)
    fun findCommentReport()
    fun setCommentSanction(commentId: Int)
    fun findUserSanction()
    fun setUserSanction(userId: Int)
}
