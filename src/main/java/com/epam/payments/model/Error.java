package com.epam.payments.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.epam.payments.model.enums.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Error {
    private String message;
    private ErrorType errorType;
    private LocalDateTime timeStamp;
}
