package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.IEventRepository;
import com.example.demo.Service.IEventService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EventService implements IEventService {
    private final IEventRepository eventRepository;
}
