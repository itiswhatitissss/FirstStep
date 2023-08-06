package com.example.firststep.service;

import com.example.firststep.domain.FBoard;
import com.example.firststep.dto.BoardDTO;

import java.util.List;

public interface BoardService {

    String register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    List<FBoard> getAllFriend();

    void delete(Long fno);

    void modify(BoardDTO boardDTO);



}
