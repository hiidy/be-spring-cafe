package codesquad.springcafe.article.database;

import codesquad.springcafe.article.Article;
import codesquad.springcafe.article.ArticleRowMapper;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class ArticleH2Database implements ArticleDatabase {

    JdbcTemplate jdbcTemplate;

    public ArticleH2Database(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Article article) {
        String sql = "INSERT INTO article (author, title, contents) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, article.getAuthor(), article.getTitle(),
            article.getContents());
    }

    @Override
    public Article findById(long articleId) {
        String sql = "SELECT * FROM article WHERE articleid = ?";
        return jdbcTemplate.queryForObject(sql, new ArticleRowMapper(), articleId);
    }

    @Override
    public List<Article> findAll() {
        String sql = "SELECT * FROM article";
        return jdbcTemplate.query(sql, new ArticleRowMapper());
    }

    @Override
    public void clear() {
        jdbcTemplate.update("DELETE FROM article");
    }

}