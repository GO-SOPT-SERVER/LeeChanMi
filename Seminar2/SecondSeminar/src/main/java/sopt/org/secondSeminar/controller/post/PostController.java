package sopt.org.secondSeminar.controller.post;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.secondSeminar.controller.post.dto.request.ReqRegisterPost;
import sopt.org.secondSeminar.controller.post.dto.response.ResGetPost;
import sopt.org.secondSeminar.controller.post.dto.response.ResRegisterPost;
import sopt.org.secondSeminar.domain.Post;
import sopt.org.secondSeminar.service.PostService;

import java.util.ArrayList;

import static sopt.org.secondSeminar.SecondSeminarApplication.postList;

@RestController
@RequestMapping("/post")
@AllArgsConstructor
public class PostController {
    private final PostService postService;

    // 포스트 생성
    @PostMapping
    @ResponseBody
    public ResRegisterPost registerPost(@RequestBody ReqRegisterPost request){
        Long postId = postService.register(request);
        System.out.println(postList.get(postId.intValue() -1).toString());

        ResRegisterPost resRegisterPost = new ResRegisterPost(postId);

        return resRegisterPost;
    }
    
    // 포스트 id로 가져오기
    @GetMapping("/{postId}")
    @ResponseBody
    public ResGetPost getPostById(@PathVariable long postId) {
        System.out.println("요청 포스트 아이디 : " + postId);

        ResGetPost resGetPostById = new ResGetPost(
                postList.get((int)postId - 1).getPostId(),
                postList.get((int)postId - 1).getAuthorId(),
                postList.get((int)postId - 1).getTitle(),
                postList.get((int)postId - 1).getContent(),
                postList.get((int)postId - 1).getRegisteredDate(),
                postList.get((int)postId - 1).getUpdatedDate()
        );

        return resGetPostById;
    }

    // 포스트 제목 검색하기
    @GetMapping("/search")
    @ResponseBody
    public ArrayList<ResGetPost> getPostByTitle(@RequestParam String title) {
        System.out.println("요청 포스트 제목 : " + title);

        ArrayList<ResGetPost> resGetPostsList = new ArrayList<>();

        for(Post post : postList) {
            if(post.getTitle().equals(title)) {
                resGetPostsList.add(
                        new ResGetPost(
                            post.getPostId(),
                            post.getAuthorId(),
                            post.getTitle(),
                            post.getContent(),
                            post.getRegisteredDate(),
                            post.getUpdatedDate()
                        )
                );
            }
        }
        
        return resGetPostsList;
    }
}
