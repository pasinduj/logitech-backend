package com.swise.logitech.controller;


import com.swise.logitech.dto.CustomerDTO;
import com.swise.logitech.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/all")
    public List<CustomerDTO> getAllCustomers() {
        List<CustomerDTO> resultMap = customerService.getAllCustomers();

        return resultMap;
    }


}
