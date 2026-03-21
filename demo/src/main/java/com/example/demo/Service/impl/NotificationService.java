package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.INotificationRepository;
import com.example.demo.Service.INotificationService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class NotificationService implements INotificationService{
    private final INotificationRepository notificationRepository;
}
