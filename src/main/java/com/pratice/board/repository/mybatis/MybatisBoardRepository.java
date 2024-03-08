package com.pratice.board.repository.mybatis;

import com.pratice.board.dto.BoardDTO;
import com.pratice.board.dto.BoardFileDTO;
import com.pratice.board.dto.PageDTO;
import com.pratice.board.dto.TitleSearchCond;
import com.pratice.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MybatisBoardRepository implements BoardRepository {

    private final BoardMapper boardMapper;
    @Override
    public BoardDTO save(BoardDTO boardDTO) {
        boardMapper.save(boardDTO);
        return boardDTO;
    }
    @Override
    public void saveFile(BoardFileDTO boardFileDTO) {
        boardMapper.saveFile(boardFileDTO);
    }
    @Override
    public List<BoardDTO> findAll(TitleSearchCond titleSearchCond, PageDTO pageDTO) {
        return boardMapper.findAll(titleSearchCond, pageDTO);
    }
    @Override
    public void updateViewCount(Long id) {
        boardMapper.updateViewCount(id);
    }
    @Override
    public BoardDTO findById(Long id) {
        return boardMapper.findById(id);
    }
    @Override
    public List<BoardFileDTO> findFile(Long id) {
        return boardMapper.findFile(id);
    }
    @Override
    public void delete(Long id) {
        boardMapper.delete(id);
    }
    @Override
    public void update(BoardDTO boardDTO) {
        boardMapper.update(boardDTO);
    }
    @Override
    public Long getTotalCount() {
        return boardMapper.getTotalCount();
    }
}
