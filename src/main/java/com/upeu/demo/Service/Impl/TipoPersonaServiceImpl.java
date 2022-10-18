/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upeu.demo.Service.Impl;

import com.upeu.demo.Entity.Taller;
import com.upeu.demo.Entity.TipoPersona;
import com.upeu.demo.Repository.TallerRepository;
import com.upeu.demo.Repository.TipoPersonaRepository;
import com.upeu.demo.Service.TallerService;
import com.upeu.demo.Service.TipoPersonaService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Martín Del Águila
 */
@Service
public class TipoPersonaServiceImpl implements TipoPersonaService{

    @Autowired
    private TipoPersonaRepository TipoPersonaRepository;

    @Transactional
    @Override
    public List<TipoPersona> findAll() {
        return (List<TipoPersona>) TipoPersonaRepository.findAll();
    }

    @Override
    public TipoPersona findById(Long id) {
        return TipoPersonaRepository.findById(id).orElse(null);
    }

    @Override
    public TipoPersona save(TipoPersona tipoPersona) {
        return TipoPersonaRepository.save(tipoPersona);
    }

    @Override
    public void delete(TipoPersona tipoPersona) {
        TipoPersonaRepository.delete(tipoPersona);
    }

    @Override
    public void deleteById(Long id) {
        TipoPersonaRepository.deleteById(id);
    }
}
