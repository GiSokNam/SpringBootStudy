package com.pratice.board.repository.mybatis;

import com.pratice.board.dto.BoardDTO;
import com.pratice.board.dto.BoardFileDTO;
import com.pratice.board.dto.PageDTO;
import com.pratice.board.dto.TitleSearchCond;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
    void save(BoardDTO boardDTO);
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
