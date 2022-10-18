/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upeu.demo.Service.Impl;

import com.upeu.demo.Entity.Programa;
import com.upeu.demo.Entity.Taller;
import com.upeu.demo.Repository.ProgramaRepository;
import com.upeu.demo.Repository.TallerRepository;
import com.upeu.demo.Service.ProgramaService;
import com.upeu.demo.Service.TallerService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Martín Del Águila
 */

@Service
public class TallerServiceImpl implements TallerService{

    @Autowired
    private TallerRepository TallerRepository;

    @Transactional
    @Override
    public List<Taller> findAll() {
        return (List<Taller>) TallerRepository.findAll();
    }

    @Override
    public Taller findById(Long id) {
        return TallerRepository.findById(id).orElse(null);
    }

    @Override
    public Taller save(Taller taller) {
        return TallerRepository.save(taller);
    }

    @Override
    public void delete(Taller taller) {
        TallerRepository.delete(taller);
    }

    @Override
    public void deleteById(Long id) {
        TallerRepository.deleteById(id);
    }
}
