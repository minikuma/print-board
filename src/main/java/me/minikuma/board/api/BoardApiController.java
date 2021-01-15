package me.minikuma.board.api;

import lombok.RequiredArgsConstructor;
import me.minikuma.board.dto.BoardListDto;
import me.minikuma.board.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wminikuma@gmail.com on 2021/01/15
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/board")
public class BoardApiController {

    private final BoardService boardService;

    @GetMapping("/list")
    public List<BoardListDto> getList() {
        return boardService.list();
    }
}
