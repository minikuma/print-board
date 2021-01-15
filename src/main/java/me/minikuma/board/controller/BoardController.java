package me.minikuma.board.controller;

import lombok.RequiredArgsConstructor;
import me.minikuma.board.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wminikuma@gmail.com on 2021/01/14
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping({"/", ""})
    public ModelAndView home() {
        return new ModelAndView("board/home");
    }

    @GetMapping("/list")
    public ModelAndView list() {
        ModelAndView view = new ModelAndView("board/list");
        view.addObject("boardList", boardService.list());
        return view;
    }

    @GetMapping("/read")
    public ModelAndView read(@RequestParam int seq) {
        ModelAndView view = new ModelAndView("board/read");
        view.addObject("board", boardService.select(seq));
        return view;
    }
}
