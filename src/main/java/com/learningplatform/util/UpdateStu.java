package com.learningplatform.util;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateStu {
//    更新的是用户表
    private Integer userId;
    private String user_pwd;
    private String login_name;
    private String user_name;
    private String email;
    private String tel;
//更新的是任务表
    private Integer taskId;
    private Integer task_status;
}
