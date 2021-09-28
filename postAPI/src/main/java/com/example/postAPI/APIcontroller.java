package com.example.postAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.http.entity.StringEntity;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/services")
public class APIcontroller {
    StringEntity input = new StringEntity("<CustomerDetailedInquiry>\n" +
            "    <dial>201284705243</dial>\n" +
            "    <fromdate>2021-09-01</fromdate>\n" +
            "    <todate>2021-09-21</todate>\n" +
            "    <Lang>En</Lang>\n" +
            "    <TransactionID>487fc7b1-9b68-4626-b38c-c74292034186</TransactionID>\n" +
            "    <callername>Digital</callername>\n" +
            "</CustomerDetailedInquiry>");
    private Object StringEntity;

    public APIcontroller() throws UnsupportedEncodingException {
    }

    @PostMapping("/consumption_summary")
    public String greeting(){
        return (String) StringEntity;
    }

}
