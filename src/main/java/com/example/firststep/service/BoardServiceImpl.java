package com.example.firststep.service;

import com.example.firststep.domain.FBoard;
import com.example.firststep.dto.BoardDTO;
import com.example.firststep.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardServiceImpl implements BoardService{

    private final ModelMapper modelMapper;
    private final BoardRepository boardRepository;

    public List<FBoard> getAllFriend() {

        return boardRepository.findAll();
    }

    @Override
    public void delete(Long fno) {
        boardRepository.deleteById(fno);
    }

    @Override
    public void modify(BoardDTO boardDTO) {
        Optional<FBoard> result = boardRepository.findById(boardDTO.getFno());
        FBoard fboard = result.orElseThrow();
        fboard.modify(boardDTO.getName(), boardDTO.getAddress(), boardDTO.getEmail(), boardDTO.getPhone());
        boardRepository.save(fboard);
    }

    @Override
    public String register(BoardDTO boardDTO) {
        FBoard friend = modelMapper.map(boardDTO, FBoard.class);
        String name = boardRepository.save(friend).getName() ;
        return name;
    }

    @Override
    public BoardDTO readOne(Long fno) {

        Optional<FBoard> result = boardRepository.findById(fno);
        FBoard friend = result.orElseThrow();

        BoardDTO boardDTO = modelMapper.map(friend, BoardDTO.class);

        return boardDTO;
    }
}
