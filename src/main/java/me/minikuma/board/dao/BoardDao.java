package me.minikuma.board.dao;

import me.minikuma.board.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wminikuma@gmail.com on 2021/01/14
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
@Repository
public interface BoardDao {
    List<Board> list();
}
