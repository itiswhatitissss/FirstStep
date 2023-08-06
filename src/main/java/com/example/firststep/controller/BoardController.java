package com.example.firststep.controller;

import com.example.firststep.domain.FBoard;
import com.example.firststep.dto.BoardDTO;
import com.example.firststep.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RequestMapping("/board")
@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public void list(BoardDTO boardDTO, Model model){
        List<FBoard> result = boardService.getAllFriend();
        model.addAttribute("list",result);
    }

    @GetMapping("/register")
    public void registerGet(){

    }

    @PostMapping("/register")
    public String registerPost(BoardDTO boardDTO, RedirectAttributes rttr){
        String name = boardService.register(boardDTO);
//        rttr.addFlashAttribute("result", name); "이성진님이 등록되었습니다"

        return "redirect:/board/list";
    }

    @GetMapping({"/read","/modify"})
    public void detail(Long fno,BoardDTO boardDTO, Model model){
        BoardDTO detail = boardService.readOne(fno);
        model.addAttribute("friend",detail);
    }

    @PostMapping("/delete")
    public String delete(Long fno){
        boardService.delete(fno);
        return "redirect:/board/list";
    }

    @PostMapping("/modify")
    public String modify(BoardDTO boardDTO){
        boardService.modify(boardDTO);
        return "redirect:/board/list";
    }

}
