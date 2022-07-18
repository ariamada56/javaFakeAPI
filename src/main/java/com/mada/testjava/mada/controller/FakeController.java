package com.mada.testjava.mada.controller;

import com.mada.testjava.mada.services.FakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FakeController {
    @Autowired
    FakeService fakeService;
    @GetMapping("/GetFakeAPI")
    public ResponseEntity <?> getData () {
        return ResponseEntity.ok(fakeService.getData());
    }
}
