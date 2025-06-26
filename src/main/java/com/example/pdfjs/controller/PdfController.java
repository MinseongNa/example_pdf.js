package com.example.pdfjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PdfController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/viewer_js")
    public String viewerJs() {
        return "viewer_js";
    }

    @GetMapping("/viewer_mjs")
    public String viewerMjs() {
        return "viewer_mjs";
    }
}