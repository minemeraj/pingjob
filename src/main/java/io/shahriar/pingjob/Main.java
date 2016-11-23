package io.shahriar.pingjob;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;

public class Main {
    public static void main(String[] args) {
        final String mainURL = "http://shahriar.io/";
        final String jenkinsURL = "http://jenkins.shahriar.io/";
        final String mavensURL = "http://maven.shahriar.io/";
        GetRequest jenkinsrequest = Unirest.get(jenkinsURL);
        GetRequest mavensrequest = Unirest.get(mavensURL);
        GetRequest mainrequest = Unirest.get(mainURL);
    try {
        while(jenkinsrequest.asString().getStatus() != 200) {
            System.out.println("jenkins down... Waiting...");
            Thread.sleep(3000);
        }
        while(mavensrequest.asString().getStatus() != 200) {
            System.out.println("maven down... Waiting...");
            Thread.sleep(3000);
        }
        while(mainrequest.asString().getStatus() != 200) {
            System.out.println("maven down... Waiting...");
            Thread.sleep(3000);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
