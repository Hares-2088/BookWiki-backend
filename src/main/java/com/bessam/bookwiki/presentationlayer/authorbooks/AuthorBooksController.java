package com.bessam.bookwiki.presentationlayer.authorbooks;

import com.bessam.bookwiki.businesslayer.authorbooks.AuthorBooksService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/authors/{authorId}/books")
public class AuthorBooksController {
    private AuthorBooksService authorBooksService;

    public AuthorBooksController(AuthorBooksService authorBooksService) {
        this.authorBooksService = authorBooksService;
    }

    @GetMapping()
    public ResponseEntity<AuthorBooksResponseDTO> getAllBooksForAnAuthor(@PathVariable String authorId){
        return ResponseEntity.status(HttpStatus.OK).body(authorBooksService.getAllBooksByAuthorId(authorId));
    }
}
