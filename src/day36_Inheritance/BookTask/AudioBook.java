package day36_Inheritance.BookTask;

public class AudioBook extends Book{
    /*
   3.3 Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator
			Methods:
				setInfo()
				listen()
				toString()
     */

    public int length;
public String narrator;

    public void setInfo(int length, String narrator) {
        this.length = length;
        this.narrator = narrator;
    }

    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public void listen(){
        System.out.println(author+" is listening");
    }




}
