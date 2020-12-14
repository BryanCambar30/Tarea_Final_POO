/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_final_poo;

/**
 *
 * @author Cambar
 */
public abstract class IngSistemas extends Persona{
    private int nColegiado;

    public IngSistemas(int id, int nColegiado) {
        super(id);
        this.nColegiado = nColegiado;
    }

    public int getnColegiado() {
        return nColegiado;
    }
    public void setnColegiado(int nColegiado) {
        this.nColegiado = nColegiado;
    }
    
}