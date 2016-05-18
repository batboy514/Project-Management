package com.example.jethro.firebasesavemessage;

/**
 * Created by jethro on 5/17/2016.
 */
public class ChatMessage {

    private String author;
    private String message;

    public ChatMessage()
    {

    }
    public ChatMessage(String author,String message)
    {
        this.message=message;
        this.author=author;

    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}
