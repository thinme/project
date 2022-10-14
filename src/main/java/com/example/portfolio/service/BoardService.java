package com.example.portfolio.service;

import com.example.portfolio.dto.BoardDTO;
import com.example.portfolio.pageMaker.PageMaker;
import com.example.portfolio.repository.BoardRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService{
    public void write(BoardDTO board) throws Exception;
    public BoardDTO read(int bno) throws Exception;
    public void modify(BoardDTO board) throws Exception;
    public void remove(int bno) throws Exception;

    public List<BoardDTO> listSearchCriteria(PageMaker pm) throws Exception;
    public int listSearchCount(PageMaker pm) throws Exception;


    BoardRepository getMapper(Class<BoardRepository> boardRepositoryClass);
}
