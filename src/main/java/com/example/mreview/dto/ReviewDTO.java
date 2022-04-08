package com.example.mreview.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO {

    //review num
    private Long reviewNum;

    //Movie mno
    private Long mno;

    //member id
    private Long mid;
    //Member nickname
    private String nickname;
    //member email
    private String email;

    private int grade;

    private String text;

    private LocalDateTime regDate, modDate;
}
