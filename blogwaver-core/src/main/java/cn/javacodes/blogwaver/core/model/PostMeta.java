package cn.javacodes.blogwaver.core.model;

/**
 * blogwaver
 * cn.javacodes.blogwaver.core.model
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/01/20
 */
public class PostMeta {
    private Long id;

    private Long postId;

    private String name;

    private String value;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}