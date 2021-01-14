package me.minikuma.board.service;

import me.minikuma.board.dto.BoardDto;
import me.minikuma.board.dto.BoardListDto;

import java.util.List;

/**
 * Created by wminikuma@gmail.com on 2021/01/14
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public interface BoardService {
    List<BoardListDto> list();
    BoardDto select(int seq);
}
