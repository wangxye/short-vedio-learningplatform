package com.learningplatform.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubmitTask {
    private Integer vbid;
    private String usersId;
    private String detail;
    private Integer level;
    private Integer type;
}
