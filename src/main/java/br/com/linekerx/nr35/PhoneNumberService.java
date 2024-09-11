package br.com.linekerx.nr35;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneNumberService {
    @Autowired
    private PhoneNumberRepository repository;

    public PhoneNumber save(PhoneNumber phoneNumber) {
        return repository.save(phoneNumber);
    }

    public List<PhoneNumber> findAll() {
        return repository.findAll();
    }
}
