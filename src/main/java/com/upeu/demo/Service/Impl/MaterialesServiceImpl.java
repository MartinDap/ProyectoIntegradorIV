/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upeu.demo.Service.Impl;

import com.upeu.demo.Entity.Materiales;
import com.upeu.demo.Entity.Persona;
import com.upeu.demo.Repository.MaterialesRepository;
import com.upeu.demo.Repository.PersonaRepository;
import com.upeu.demo.Service.MaterialesService;
import com.upeu.demo.Service.PersonaService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Martín Del Águila
 */
@Service
public class MaterialesServiceImpl implements MaterialesService{
    @Autowired
    private MaterialesRepository MaterialesRepository;

    @Transactional
    @Override
    public List<Materiales> findAll() {
        return (List<Materiales>) MaterialesRepository.findAll();
    }

    @Override
    public Materiales findById(Long id) {
        return MaterialesRepository.findById(id).orElse(null);
    }

    @Override
    public Materiales save(Materiales materiales) {
        return MaterialesRepository.save(materiales);
    }

    @Override
    public void delete(Materiales materiales) {
        MaterialesRepository.delete(materiales);
    }

    @Override
    public void deleteById(Long id) {
        MaterialesRepository.deleteById(id);
    }
}

