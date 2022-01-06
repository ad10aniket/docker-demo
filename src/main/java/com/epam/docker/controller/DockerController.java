package com.epam.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

	@GetMapping("/image")
	public String getGreetings(String msg)
	{
		return "Hi this is Docker image.";
	}
}
