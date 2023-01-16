package com.colabear754.springdoc_example.controllers

import com.colabear754.springdoc_example.domain.BoardDTO
import com.colabear754.springdoc_example.mapper.BoardMapper
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "게시판 글 API", description = "게시판 글을 다루는 API")
@RestController
class BoardController(private val boardMapper: BoardMapper) {
    @Operation(summary = "게시글 목록 조회", description = "모든 게시글 목록을 조회합니다.")
    @GetMapping("/document-list")
    fun documentList(): List<BoardDTO> = boardMapper.getDocuments()
}