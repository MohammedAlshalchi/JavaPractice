package day36_Inheritance.BookTask;

public class EBook extends Book{
    /*
    3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size,pages
			Methods:
				setInfo()
				readBook()
				toString()
     */
public String size;
public int pages;

    public void setInfo(String size, int pages) {
        this.size = size;
        this.pages = pages;
    }


    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", pages=" + pages +
                '}';
    }

    public void readBook(){
    System.out.println("I am reding "+title);
}




















}
