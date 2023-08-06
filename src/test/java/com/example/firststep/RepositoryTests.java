package com.example.firststep;

import com.example.firststep.domain.FBoard;
import com.example.firststep.domain.FBoard;
import com.example.firststep.repository.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class RepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void testInsert(){
        FBoard friend = FBoard.builder()
                .name("박종진")
                .address("인계동")
                .email("whdwls")
                .phone("0103333")
                .build();

        boardRepository.save(friend);
    }
}
