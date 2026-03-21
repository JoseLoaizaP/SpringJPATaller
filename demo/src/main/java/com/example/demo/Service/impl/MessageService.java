package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.IMessageRepository;
import com.example.demo.Service.IMessageService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MessageService implements IMessageService{
    private final IMessageRepository messageRepository;
}
