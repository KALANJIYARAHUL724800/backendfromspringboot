package com.example.backend_form.controller;

import com.example.backend_form.entity.Form;
import com.example.backend_form.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("api/form")
public class FormController {
    @Autowired
    private FormService formService;
    @GetMapping
    public ResponseEntity getForm()
    {
        return new ResponseEntity(formService.showForm(),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity insertForm(@RequestBody Form data)
    {
        return new ResponseEntity(formService.insertForm(data),HttpStatus.OK);
    }
}
