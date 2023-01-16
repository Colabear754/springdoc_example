package com.colabear754.springdoc_example.mapper

import com.colabear754.springdoc_example.domain.BoardDTO
import org.apache.ibatis.annotations.Mapper

@Mapper
interface BoardMapper {
    fun getDocuments(): List<BoardDTO>
}