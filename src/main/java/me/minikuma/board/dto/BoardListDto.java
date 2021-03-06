package me.minikuma.board.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import me.minikuma.board.entity.Board;

/**
 * Created by wminikuma@gmail.com on 2021/01/14
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
@Data
@NoArgsConstructor
public class BoardListDto {
    private int seq;
    private String title;
    private String writer;
    private int cnt;

     public BoardListDto(Board board) {
        this.seq = board.getSeq();
        this.title = board.getTitle();
        this.writer = board.getWriter();
        this.cnt = board.getCnt();
    }
}
