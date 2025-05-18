package com.example.todo_api.controller.sample;

import com.example.todo_api.service.sample.SampleService;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/samples")
@RequiredArgsConstructor
public class SampleController {

  private final SampleService service;

  // GET /samples
  @GetMapping
  public SampleDTO index() {
    var entity = service.find();
    return new SampleDTO(entity.getContent(), LocalDateTime.now());
  }

}
