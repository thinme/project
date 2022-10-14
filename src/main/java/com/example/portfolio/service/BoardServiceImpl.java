package com.example.portfolio.service;

import com.example.portfolio.dto.BoardDTO;
import com.example.portfolio.pageMaker.PageMaker;
import com.example.portfolio.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;



public abstract class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardService boardService;
    @Override
    public void write(BoardDTO board) throws Exception {
        System.out.println(boardService);
        BoardRepository dao=boardService.getMapper(BoardRepository.class);
        dao.create(board);
    }

    @Override
    public BoardDTO read(int bno) throws Exception {
        BoardRepository dao=boardService.getMapper(BoardRepository.class);

        return dao.read(bno);
    }

    @Override
    public void modify(BoardDTO board) throws Exception {
        BoardRepository dao=boardService.getMapper(BoardRepository.class);
        dao.update(board);
    }

    @Override
    public void remove(int bno) throws Exception {
        BoardRepository dao=boardService.getMapper(BoardRepository.class);
        dao.delete(bno);

    }

    @Override
    public List<BoardDTO> listSearchCriteria(PageMaker pm) throws Exception {
        BoardRepository dao=boardService.getMapper(BoardRepository.class);
        return dao.listSearch(pm);
    }

    @Override
    public int listSearchCount(PageMaker pm) throws Exception {
        BoardRepository dao=boardService.getMapper(BoardRepository.class);
        return dao.listSearchCount(pm);
    }

    @Override
    public BoardRepository getMapper(Class<BoardRepository> boardRepositoryClass) {
        return null;
    }


}
