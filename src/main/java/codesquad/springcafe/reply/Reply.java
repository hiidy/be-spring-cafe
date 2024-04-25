package codesquad.springcafe.reply;

import java.sql.Timestamp;

public class Reply {

    private Long replyId;
    private String author;
    private String contents;
    private Long articleId;
    private Timestamp createdTime;
    private boolean deleted;

    public Reply(Long replyId, String author, String contents, Long articleId,
        Timestamp createdTime, boolean deleted) {
        this.replyId = replyId;
        this.author = author;
        this.contents = contents;
        this.articleId = articleId;
        this.createdTime = createdTime;
        this.deleted = deleted;
    }

    public Long getReplyId() {
        return replyId;
    }

    public String getAuthor() {
        return author;
    }

    public String getContents() {
        return contents;
    }


    public Long getArticleId() {
        return articleId;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public boolean isDeleted() {
        return deleted;
    }
}
