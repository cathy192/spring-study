package java8to11.spring;

import java.util.Optional;

public class OnlineClass {
    private Integer id;

    private String title;

    private boolean closed;
    public Progress progress;


    public OnlineClass(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Optional <Progress> getProgress() {
        //에러를 던지는 것에 문제는 에러처리를 강제하는 문제있음
       //  if(this.progress == null)
         //    throw  new IllegalStateException();
        return Optional.ofNullable(progress); //박스에 넣을때 null있을 수 있다라는 의미
    }
    //null값이 넘어올 수 있기에 비어있는지 또 체크해주어야되서 번거로워짐
    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
