package cn.javacodes.blogwaver.core.model;

/**
 * blogwaver
 * cn.javacodes.blogwaver.core.model
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/01/20
 */
public class PostTag {
    private Long id;

    private Long postId;

    private Long tagId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}