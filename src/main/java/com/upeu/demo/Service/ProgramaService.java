/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.upeu.demo.Service;

import com.upeu.demo.Entity.PersonaTaller;
import com.upeu.demo.Entity.Programa;
import java.util.List;

/**
 *
 * @author Martín Del Águila
 */
public interface ProgramaService {

    public List<Programa> findAll();

    public Programa findById(Long id);

    public Programa save(Programa programa);

    public void delete(Programa programa);

    public void deleteById(Long id);
}
