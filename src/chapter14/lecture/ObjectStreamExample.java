package chapter14.lecture;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Post implements Serializable {

    private int id; // 글 번호

    private String title; // 제목

    private String content; // 내용

    private String writer; // 작성자

    private LocalDate date; // 작성일

    // 생성자
    public Post(int id, String title, String content, String writer, LocalDate date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    // region Getter, Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    // endregion

    // toString()
    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", date=" + date +
                '}';
    }
}

public class ObjectStreamExample {
    public static void main(String[] args) throws Exception {
        writeList();
        List<Post> Board = readList();

        for (Post post : Board) {
            System.out.println(post);
        }
    }

    private static void writeList() throws IOException {
        List<Post> board = new ArrayList<>();

        board.add(new Post(1, "제목1", "내용1", "글쓴이1", LocalDate.now()));
        board.add(new Post(2, "제목2", "내용2", "글쓴이2", LocalDate.now()));
        board.add(new Post(3, "제목3", "내용3", "글쓴이3", LocalDate.now()));

        OutputStream fos = new FileOutputStream("c:/temp/board.db");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(board);

        oos.flush();
        oos.close();
    }

    private static List<Post> readList() throws Exception {
        InputStream fis = new FileInputStream("c:/temp/board.db");
        ObjectInputStream ois = new ObjectInputStream(fis);

        List<Post> board = (List<Post>) ois.readObject();
        return board;
    }
}
