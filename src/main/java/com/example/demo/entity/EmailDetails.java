package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {
    // Class data members
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
}
