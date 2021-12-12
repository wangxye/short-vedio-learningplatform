package com.learningplatform.util;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DelStu {
    private Integer user_id;
    private String userName;
    private Integer status;
}
