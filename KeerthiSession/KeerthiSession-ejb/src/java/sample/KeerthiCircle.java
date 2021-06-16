/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import javax.ejb.Stateless;

/**
 *
 * @author keerthiraj
 */
@Stateless
public class KeerthiCircle implements KeerthiCircleLocal {

    @Override
    public Double CircleArea(double radius) {
        return (3.14*radius*radius);
    }


    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Double CircleCircum(double radius) {
        return (2*3.14*radius);
    }
}
