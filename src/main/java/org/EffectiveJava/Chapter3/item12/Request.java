package org.EffectiveJava.Chapter3.item12;

// Item 12: Always override toString
public class Request {

    public String header;
    public String body;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Request{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
