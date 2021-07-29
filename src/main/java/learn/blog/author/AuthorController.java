package learn.blog.author;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/authors")
public class AuthorController {

    private static final List<Author> authors = Arrays.asList(
            new Author(1, "Victor Caragiu"),
            new Author(2, "James Bond")
    );

    @GetMapping(path="/{authorId}")
    public Author getAuthor(@PathVariable("authorId") Integer authorId){
        return authors.stream()
                .filter(author -> authorId.equals(author.getAuthorId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Author " + authorId + "dos not exist."));
    }
}
