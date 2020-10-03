package Articles2;

public class Articles2 {
    //{title}, {content}, {author}
    private String title;
    private String content;
    private String author;

    public Articles2(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
       // this.order = order;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        //Science - planets: Bill
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
