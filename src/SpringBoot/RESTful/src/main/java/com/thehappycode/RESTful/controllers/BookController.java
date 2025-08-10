package com.thehappycode.RESTful.controllers;

import com.thehappycode.RESTful.models.Book;
import com.thehappycode.RESTful.services.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Tag(name="Book", description = "Book management APIs")
@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @Operation(
            summary = "Home API",
            description = "API mặc định"
            // tags = {"/api/book", "get"}
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    content = { @Content(
                            schema = @Schema(implementation = String.class),
                            mediaType = "application/json") }
            ),
            @ApiResponse(responseCode = "401", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "502", content = { @Content(schema = @Schema()) })
    })
    @GetMapping("/")
    public String home(){
        return "Welcome to the Book API!";
    }

    @Operation(
            summary = "Lấy tất cả danh sách Book",
            description = "Lấy tất cả danh sách Book"
            // tags = { "api/book", "get" }
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            array = @ArraySchema(schema = @Schema(implementation = Book.class)),
                            mediaType = "application/json")),
            @ApiResponse(responseCode = "401", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "502", content = {@Content(schema = @Schema())})
    })
    @GetMapping("/findall")
    public List<Book> findAllBooks(){
        return bookService.findAllBooks();
    }

    @Operation(
            summary = "Lấy Book theo Id",
            description = "Lấy Book theo Id"
            // tags = { "api/book", "get" }
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            schema = @Schema(implementation = Book.class),
                            mediaType = "application/json")),
            @ApiResponse(responseCode = "401", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "502", content = {@Content(schema = @Schema())})
    })
    @GetMapping("/findbyid/{id}")
    public Book findBookById(@PathVariable int id){
        return bookService.findBookById(id);
    }

    @Operation(
            summary = "Xoá tất cả Book theo Id",
            description = "Xoá tất cả Book theo Id"
            // tags = { "api/book", "delete" }
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            schema = @Schema(implementation = String.class),
                            mediaType = "application/json")),
            @ApiResponse(responseCode = "401", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "502", content = {@Content(schema = @Schema())})
    })
    @DeleteMapping("/delete")
    public String deleteAllBooks(){
        bookService.deleteAllBooks();
        return "All books have been deleted.";
    }
}
