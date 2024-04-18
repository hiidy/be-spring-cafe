package codesquad.springcafe.article.dto;

import codesquad.springcafe.article.Article;
import codesquad.springcafe.article.ArticleBuilder;

public class ArticleUpdateDto {

    private String title;
    private String contents;

    public ArticleUpdateDto(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public Article toEntity() {
        return new ArticleBuilder()
            .title(title)
            .contents(contents)
            .build();
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

}