package com.pratice.board.repository;


import com.pratice.board.dto.BoardDTO;
import com.pratice.board.dto.BoardFileDTO;
import com.pratice.board.dto.PageDTO;
import com.pratice.board.dto.TitleSearchCond;

import java.util.List;

public interface BoardRepository {
    BoardDTO save(BoardDTO boardDTO);
    void saveFile(BoardFileDTO boardFileDTO);
    List<BoardDTO> findAll(TitleSearchCond titleSearchCond, PageDTO pageDTO);
    void updateViewCount(Long id);
    BoardDTO findById(Long id);
    List<BoardFileDTO> findFile(Long id);
    void delete(Long id);
    void update(BoardDTO boardDTO);
//    Long getTotalCount();
    Long getTotalCount(TitleSearchCond titleSearchCond);

}
