package com.example.portfolio.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SequenceGenerator(
        name="LOGIN_ID_SEQ_GEN",//시퀀스 제너레이터 이름
        sequenceName = "LOGIN_ID_SEQ",//시퀀스이름
        initialValue =1,//시작값
        allocationSize = 1//메모리를 통해 할당할 범위 사이즈
)
public class LoginEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,//사용할 전략을 시퀀스로 선택
            generator = "LOGIN_ID_SEQ_GEN"//식별자 생성기를 설정해놓은 LOGIN_ID_SEQ_GEN
    )
    private Integer id;
    @Column
    private String password;
    @Column
    private String name;
}
