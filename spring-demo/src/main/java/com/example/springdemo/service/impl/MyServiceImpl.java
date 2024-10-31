package com.example.springdemo.service.impl;

import com.example.springdemo.service.MyService;
import org.springframework.stereotype.Service;

/**
 * @author li.zhi
 * @date 2024-10-31
 **/
@Service
public class MyServiceImpl implements MyService {
	@Override
	public void say() {
		System.out.println("HiHiHi");
	}
}
