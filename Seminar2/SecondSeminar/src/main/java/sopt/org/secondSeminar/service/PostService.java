package sopt.org.secondSeminar.service;

import org.springframework.stereotype.Service;
import sopt.org.secondSeminar.controller.post.dto.request.ReqRegisterPost;
import sopt.org.secondSeminar.domain.Post;

import static sopt.org.secondSeminar.SecondSeminarApplication.postList;

@Service
public class PostService {
    public Long register(ReqRegisterPost request) {
        Post newPost = new Post(
                request.getAuthorId(),
                request.getTitle(),
                request.getContent(),
                request.getRegisteredDate(),
                request.getUpdatedDate()
        );

        postList.add(newPost);
        newPost.setPostId((long) postList.size());

        return newPost.getPostId();
    }
}
