package com.greedy.level02.normal.book.model.dto;

public class BookDTO {

    /* 1번 */
    private String title;

    private String publisher;

    private String author;

    private int price;

    private double discountRate;

    /* 2번 */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    /* 3번 */
    public BookDTO() {
        System.out.println("기본 생성자를 이용하여 인스턴스 생성  필드 값 출력");
    }

    public BookDTO(String title, String publisher, String author) {
        System.out.println("필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력");
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        System.out.println("모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력");
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    /* 4번 */
    public String printInformation()  {
        return "=> " + this.title + " " + this.publisher + " " + this.author + " " + this.price + " " +  this.discountRate;
    }
    /* 다른 방법1 */
//    public void printInformation()  {
//        System.out.println("=> " + this.title + " " + this.publisher + " " + this.author + " " + this.price + " " +  this.discountRate);
//    }
}
