package me.minikuma.board.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * Created by wminikuma@gmail.com on 2021/01/14
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardUploadFile {
    private int seq;
    private int fileNo;
    private String fileName;
    private String filePath;
    private String fileSize;
    private String isDeleted;
    private String regId;
    private Timestamp regDate;
    private String updId;
    private Timestamp updDate;
}
