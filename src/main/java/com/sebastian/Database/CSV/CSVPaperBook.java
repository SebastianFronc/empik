package com.sebastian.Database.CSV;

import com.opencsv.bean.CsvBindByName;
import com.sebastian.Products.Discount.DiscountBook;
import com.sebastian.Products.PaperBook;
import com.sebastian.Products.Product;

import java.math.BigDecimal;

public class CSVPaperBook implements CSVProductEntity {

    @CsvBindByName(column = "id", required = true)
    private Long id;

    @CsvBindByName(column = "name", required = true)
    private String name;

    @CsvBindByName(column = "price", required = true)
    private String price;

    @CsvBindByName(column = "author", required = true)
    private String author;

    @CsvBindByName(column = "pageCounter", required = true)
    private Integer pageCounter;

    @CsvBindByName(column = "Discount", required = true)

    private Integer pageCounter;





    // (long id, String name, BigDecimal price, Discount discount, String author, int pageCounter)
    @Override
    public Product toProduct(){
       return new PaperBook(id, name, new BigDecimal(price), author, pageCounter, new DiscountBook());
    }
}