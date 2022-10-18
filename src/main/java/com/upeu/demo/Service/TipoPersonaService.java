/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.upeu.demo.Service;

import com.upeu.demo.Entity.Taller;
import com.upeu.demo.Entity.TipoPersona;
import java.util.List;

/**
 *
 * @author Martín Del Águila
 */
public interface TipoPersonaService {

    public List<TipoPersona> findAll();

    public TipoPersona findById(Long id);

    public TipoPersona save(TipoPersona tipopersona);

    public void delete(TipoPersona tipopersona);

    public void deleteById(Long id);
}
