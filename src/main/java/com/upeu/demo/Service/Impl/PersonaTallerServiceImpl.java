/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upeu.demo.Service.Impl;

import com.upeu.demo.Entity.PersonaTaller;
import com.upeu.demo.Repository.PersonaTallerRepository;
import com.upeu.demo.Service.PersonaTallerService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Martín Del Águila
 */
@Service
public class PersonaTallerServiceImpl implements PersonaTallerService{

    @Autowired
    private PersonaTallerRepository personaTallerRepository;

    @Transactional
    @Override
    public List<PersonaTaller> findAll() {
        return (List<PersonaTaller>) personaTallerRepository.findAll();
    }

    @Override
    public PersonaTaller findById(Long id) {
        return personaTallerRepository.findById(id).orElse(null);
    }

    @Override
    public PersonaTaller save(PersonaTaller personaTaller) {
        return personaTallerRepository.save(personaTaller);
    }

    @Override
    public void delete(PersonaTaller personaTaller) {
        personaTallerRepository.delete(personaTaller);
    }

    @Override
    public void deleteById(Long id) {
        personaTallerRepository.deleteById(id);
    }
}
