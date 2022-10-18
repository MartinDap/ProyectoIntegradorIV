/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.upeu.demo.Service;

import com.upeu.demo.Entity.Programa;
import com.upeu.demo.Entity.Taller;
import java.util.List;

/**
 *
 * @author Martín Del Águila
 */
public interface TallerService {

    public List<Taller> findAll();

    public Taller findById(Long id);

    public Taller save(Taller taller);

    public void delete(Taller taller);

    public void deleteById(Long id);
}
