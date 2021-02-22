package com.example.CrudMongoDb.Service;

import com.example.CrudMongoDb.DAO.BookDAO;
import com.example.CrudMongoDb.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Collection;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDao;

   public Collection<Book> getBooks() {
       return bookDao.getBooks();
   }

    public Book createBook(Book book) {
        return bookDao.createBook(book);
    }

}
