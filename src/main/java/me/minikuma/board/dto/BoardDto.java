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
public class BoardDto {
    private String title;
    private String content;
    private String writer;

    public BoardDto(Board board) {
        this.title = board.getTitle();
        this.content = board.getContent();
        this.writer = board.getWriter();
    }
}
