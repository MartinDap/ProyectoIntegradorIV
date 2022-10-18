/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upeu.demo.Service.Impl;


import com.upeu.demo.Entity.Programa;
import com.upeu.demo.Repository.ProgramaRepository;

import com.upeu.demo.Service.PersonaTallerService;
import com.upeu.demo.Service.ProgramaService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Martín Del Águila
 */

@Service
public class ProgramaServiceImpl implements ProgramaService{

    @Autowired
    private ProgramaRepository ProgramaRepository;

    @Transactional
    @Override
    public List<Programa> findAll() {
        return (List<Programa>) ProgramaRepository.findAll();
    }

    @Override
    public Programa findById(Long id) {
        return ProgramaRepository.findById(id).orElse(null);
    }

    @Override
    public Programa save(Programa programa) {
        return ProgramaRepository.save(programa);
    }

    @Override
    public void delete(Programa programa) {
        ProgramaRepository.delete(programa);
    }

    @Override
    public void deleteById(Long id) {
        ProgramaRepository.deleteById(id);
    }
}
