package sopt.org.secondSeminar.controller.post.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResGetPost {
    private Long postId;
    private Long authorId;
    private String title;
    private String content;
    private String registeredDate;
    private String updatedDate;
}
