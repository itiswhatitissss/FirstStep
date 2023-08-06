package com.example.firststep.service;

import com.example.firststep.domain.FBoard;
import com.example.firststep.dto.BoardDTO;
import com.example.firststep.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Log4j2
@SpringBootTest
class BoardServiceImplTest {
    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private BoardService boardService;

    @Test
    public void list(BoardDTO boardDTO) {
        FBoard friends = boardRepository.searchFno(3L);
        log.info(friends);
    }

    @Test
    public void testReadOne() {
        BoardDTO boardDTO = boardService.readOne(2L);
        log.info("boardDTO : " + boardDTO);
    }

    @Test
    void register() {
    }
}