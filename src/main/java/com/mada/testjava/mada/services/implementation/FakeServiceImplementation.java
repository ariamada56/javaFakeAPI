package com.mada.testjava.mada.services.implementation;

import com.mada.testjava.mada.model.User;
import com.mada.testjava.mada.services.FakeService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeServiceImplementation implements FakeService {
    private static String baseUrl = "https://mocki.io/v1/f7ba80c4-e6cf-4bcf-aaab-7f24c6f8eee3";
    @Override
    public User getData() {
        RestTemplate restTemplate=new RestTemplate();
        User pengguna = restTemplate.getForObject(baseUrl, User.class);
        return pengguna;
    }
}
