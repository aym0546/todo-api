package com.example.todo_api.controller.sample;

import java.time.LocalDateTime;
import lombok.Value;

@Value
public class SampleDTO {

  String content;
  LocalDateTime timestamp;

  public SampleDTO(String content, LocalDateTime timestamp) {
    this.content = content;
    this.timestamp = timestamp;
  }
}
