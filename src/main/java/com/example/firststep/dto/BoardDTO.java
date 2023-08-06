package com.example.firststep.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    private Long fno;

    private String name;

    private String address;

    private String phone;

    private String email;

    private LocalDateTime regDate;

    private LocalDateTime modDate;
}
