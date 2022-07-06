package com.example.week03.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//

@Getter //getUsername 이나 getContents 자동 생성
@RequiredArgsConstructor
public class MemoRequestDto {

        private String username;
        private String contents;
        private String title;
        private String password;





}