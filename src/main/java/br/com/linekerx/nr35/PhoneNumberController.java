package br.com.linekerx.nr35;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/phone-numbers")
public class PhoneNumberController {
    @Autowired
    private PhoneNumberService service;

    @PostMapping
    public PhoneNumber create(@RequestBody PhoneNumber phoneNumber) {
        return service.save(phoneNumber);
    }

    @GetMapping
    public List<PhoneNumber> getAll() {
        return service.findAll();
    }
}
