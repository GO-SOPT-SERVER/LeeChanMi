package sopt.org.secondSeminar.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private Long postId;
    private Long authorId;
    private String title;
    private String content;
    private String registeredDate;
    private String updatedDate;

    public Post(Long authorId, String title, String content, String registeredDate, String updatedDate) {
        this.authorId = authorId;
        this.title = title;
        this.content = content;
        this.registeredDate = registeredDate;
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "postId: " + this.postId + "\n" +
                "authorId: " + this.authorId + "\n" +
                "title: " + this.title + "\n" +
                "content: " + this.content + "\n" +
                "registeredDate: " + this.registeredDate + "\n" +
                "updatedDate: " + this.updatedDate;
    }
}
