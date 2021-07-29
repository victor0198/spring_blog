package learn.blog.author;

public class Author {
    private final Integer authorId;
    private final String authorName;


    public Author(Integer authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public String getAuthorName() {
        return authorName;
    }
}
