package com.learningplatform.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private Integer id;
    private String realName;
    private String email;
    private String userName;
    private String content;
    private Timestamp createTime;
}
