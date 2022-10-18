package com.example.sweat.domain;


import lombok.Data;

import javax.persistence.*;

/**
 * Created by Vladislav Domaniewski
 */

@Entity
@Data
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String text;
    private String tag;


    public Message() {
    }

    public Message(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }



}
