package com.Prashant;

public class Message {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message(String message) {

        this.message = message;
    }
    public String printMessage(){
        System.out.println(message);
        return message;
    }
    public String salutationMessage(){
        System.out.println("Hia "+message);
        return "Hi "+message;
    }
}
