package com.bessam.bookwiki.businesslayer.book;

import com.bessam.bookwiki.dataaccesslayer.book.Book;
import com.bessam.bookwiki.dataaccesslayer.book.BookRepository;
import com.bessam.bookwiki.presentationlayer.author.AuthorResponseDTO;
import com.bessam.bookwiki.presentationlayer.book.BookRequestDTO;
import com.bessam.bookwiki.presentationlayer.book.BookResponseDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookResponseDTO> getAllBooks() {
        List<Book> bookEntities = bookRepository.findAll();

        //Convert list of movie entities to list of MovieResponseDTO
        List<BookResponseDTO> bookResponseDTOS = new ArrayList<>();

        for (Book book : bookEntities) {

            BookResponseDTO bookResponseDTO = new BookResponseDTO();
            BeanUtils.copyProperties(book, bookResponseDTO);

            bookResponseDTOS.add(bookResponseDTO);
        }

        return bookResponseDTOS;
    }

    @Override
    public BookResponseDTO getBookById(String bookId) {
        return null;
    }

    @Override
    public BookResponseDTO addBook(BookRequestDTO bookRequestDTO) {
        return null;
    }

    @Override
    public BookResponseDTO updateBook(BookRequestDTO bookRequestDTO, String bookId) {
        return null;
    }

    @Override
    public void deleteBook(String bookId) {

    }
}
