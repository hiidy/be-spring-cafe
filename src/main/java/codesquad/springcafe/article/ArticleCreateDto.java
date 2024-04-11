package codesquad.springcafe.article;

public class ArticleCreateDto {

    private long articleId;
    private String title;
    private String author;
    private String contents;

    public ArticleCreateDto(long articleId, String title, String author, String contents) {
        this.articleId = articleId;
        this.title = title;
        this.author = author;
        this.contents = contents;
    }

    public Article toEntity() {
        return new ArticleBuilder().articleId(articleId).author(author).title(title)
            .content(contents).build();
    }

    public long getArticleId() {
        return articleId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContents() {
        return contents;
    }
}
