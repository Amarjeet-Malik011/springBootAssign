package com.ttn.springBootAssign.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Database {
    //Ques.4
    @Value("${app.port}")
    private Integer port;
    @Value("${app.name}")
    private String name;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
//        Integer p=Integer.parseInt(System.getenv("port"));
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        String s=System.getenv("name");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
}
