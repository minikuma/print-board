package me.minikuma.board.service;

import lombok.RequiredArgsConstructor;
import me.minikuma.board.dto.BoardDto;
import me.minikuma.board.mapper.BoardDao;
import me.minikuma.board.entity.Board;
import me.minikuma.board.dto.BoardListDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wminikuma@gmail.com on 2021/01/14
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardDao boardDao;

    @Override
    public List<BoardListDto> list() {
        List<Board> boards = boardDao.list();
        List<BoardListDto> list = new ArrayList<>();
        for (Board board : boards) {
            list.add(new BoardListDto(board));
        }
        return list;
    }

    @Override
    public BoardDto select(int seq) {
        Board board = boardDao.select(seq);
        return new BoardDto(board);
    }
}
