package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PythonRequester {
    final static Logger log =
            LoggerFactory.getLogger(PythonRequester.class);

    @RequestMapping(
            value = "/doRequestPythonRest",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    public String doRequestPythonRest() {
        log.info("doRequestPythonRest()");

        List<HttpMessageConverter<?>> converters =
                new ArrayList<HttpMessageConverter<?>>();
        converters.add(new FormHttpMessageConverter());
        converters.add(new StringHttpMessageConverter());

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(converters);

        MultiValueMap<String, String> map =
                new LinkedMultiValueMap<String, String>();
        map.add("str", "request test");

        String result = restTemplate.getForObject(
                "http://localhost:5000/dataServer",
                String.class
        );

        log.info("result = " + result);

        return result;
    }
}