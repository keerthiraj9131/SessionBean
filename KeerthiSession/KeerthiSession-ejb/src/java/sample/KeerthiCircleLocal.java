/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import javax.ejb.Local;

/**
 *
 * @author keerthiraj
 */
@Local
public interface KeerthiCircleLocal {


    Double CircleArea(double radius);

    Double CircleCircum(double radius);
    
}
