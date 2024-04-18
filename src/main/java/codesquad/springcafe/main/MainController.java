package codesquad.springcafe.main;

import codesquad.springcafe.article.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final ArticleService articleService;

    public MainController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("articles", articleService.findAll());
        return "index";
    }

}
