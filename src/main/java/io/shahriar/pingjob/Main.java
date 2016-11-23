package io.shahriar.pingjob;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;

public class Main {
    public static void main(String[] args) {
        String url = "http://jenkins.shahriar.io/";
GetRequest request = Unirest.get(url);

    try {
        System.out.println(request.asString().getStatus());
    } catch (UnirestException e) {
        e.printStackTrace();
    }
    }
}
