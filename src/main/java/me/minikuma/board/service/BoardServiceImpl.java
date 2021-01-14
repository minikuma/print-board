package me.minikuma.board.service;

import lombok.RequiredArgsConstructor;
import me.minikuma.board.dao.BoardDao;
import me.minikuma.board.domain.Board;
import org.springframework.stereotype.Service;

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
    public List<Board> list() {
        return boardDao.list();
    }
}
