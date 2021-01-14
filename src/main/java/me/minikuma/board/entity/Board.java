package me.minikuma.board.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

/**
 * Created by wminikuma@gmail.com on 2021/01/14
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Alias("board")
public class Board {
    private int seq;
    private String title;
    private String content;
    private String writer;
    private int password;
    private String regId;
    private Timestamp regDate;
    private String updId;
    private Timestamp updDate;
    private int cnt;
}
