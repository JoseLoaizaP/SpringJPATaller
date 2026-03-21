package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.IMessageRepository;
import com.example.demo.Service.IMessageService;
import java.util.Optional;
import java.util.List;
import lombok.RequiredArgsConstructor;
import com.example.demo.domain.Message;

@RequiredArgsConstructor
@Service
public class MessageService implements IMessageService{
    private final IMessageRepository messageRepository;

    public List<Message> findAll(){
        return messageRepository.findAll();
    }
    public Optional<Message> findById(Integer id){
        return messageRepository.findById(id);
    }
    public void deleteById(Integer id){
        messageRepository.deleteById(id);
    }
    public Message save(Message message){
        return messageRepository.save(message);
    }


}
