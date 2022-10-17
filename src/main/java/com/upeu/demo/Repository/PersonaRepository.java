/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.upeu.demo.Repository;

import com.upeu.demo.Entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Martín Del Águila
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long>{
    
}
