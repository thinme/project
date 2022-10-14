package com.example.portfolio.repository;

import java.util.List;

import com.example.portfolio.dto.BoardDTO;
import com.example.portfolio.pageMaker.PageMaker;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepository extends JpaRepository<BoardDTO, Integer> {
    public void create(BoardDTO vo) throws Exception;
    public BoardDTO read(int bno) throws Exception;

    public void update(BoardDTO vo) throws Exception;

    public void delete(int bno) throws Exception;

    //
    public List<BoardDTO> listSearch(PageMaker pm)throws Exception;
    //
    public int listSearchCount(PageMaker pm)throws Exception;

}
