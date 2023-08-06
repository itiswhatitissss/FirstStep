package com.example.firststep.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FBoard extends BaseFriend{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fno;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String address;

    @Column(length = 30, nullable = false)
    private String phone;

    @Column(length = 30, nullable = false)
    private String email;

    public void modify(String name,String address, String phone, String email){
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.email=email;
    }
}
