package com.example.a_new_hope.Entity;

public class MantenimientoNave extends Mantenimiento {
    private int costoEnCreditosDeLaNave;
    private int mgltCategoryDeLaNave;
    private int velocidadMaximaDeLaNave;

    public MantenimientoNave(int costoEnCreditosDeLaNave, int mgltCategoryDeLaNave, int velocidadMaximaDeLaNave) {
        super(50);
        this.costoEnCreditosDeLaNave = costoEnCreditosDeLaNave;
        this.mgltCategoryDeLaNave = mgltCategoryDeLaNave;
        this.velocidadMaximaDeLaNave = velocidadMaximaDeLaNave;
    }

    @Override
    public int obtenerPrecio() {
        return this.getPrecioEstandar() * mgltCategoryDeLaNave + (costoEnCreditosDeLaNave * velocidadMaximaDeLaNave );
    }

}
