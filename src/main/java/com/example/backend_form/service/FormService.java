package com.example.backend_form.service;

import com.example.backend_form.entity.Form;
import com.example.backend_form.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {
    @Autowired
    private FormRepository formRepository;
    public Form insertForm(Form data)
    {
        return formRepository.save(data);
    }
    public List<Form> showForm()
    {
        return formRepository.findAll();
    }
}
