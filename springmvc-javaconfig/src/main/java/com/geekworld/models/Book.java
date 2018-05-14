package com.geekworld.models;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Book {
	
	
	@Id
	private Integer bookid;
	@Column
	private String bookName;
	@Column
	private String author;
	@Column
	private Date releaseDate;
	@Column
	private Integer price;
	@Column
	private String Genere;
	@Column
	private ArrayList listOfCountries;
	
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getGenere() {
		return Genere;
	}
	public void setGenere(String genere) {
		Genere = genere;
	}
	public ArrayList getListOfCountries() {
		return listOfCountries;
	}
	public void setListOfCountries(ArrayList listOfCountries) {
		this.listOfCountries = listOfCountries;
	}
	public Book(Integer bookid, String bookName, String author,
			Date releaseDate, Integer price, String genere,
			ArrayList listOfCountries) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.author = author;
		this.releaseDate = releaseDate;
		this.price = price;
		Genere = genere;
		this.listOfCountries = listOfCountries;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName
				+ ", author=" + author + ", releaseDate=" + releaseDate
				+ ", price=" + price + ", Genere=" + Genere
				+ ", listOfCountries=" + listOfCountries + "]";
	}
	
	

}
