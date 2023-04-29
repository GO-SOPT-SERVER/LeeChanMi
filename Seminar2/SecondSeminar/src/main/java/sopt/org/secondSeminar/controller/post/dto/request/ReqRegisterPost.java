package sopt.org.secondSeminar.controller.post.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ReqRegisterPost {
    private Long authorId;
    private String title;
    private String content;
    private String registeredDate;
    private String updatedDate;
}
