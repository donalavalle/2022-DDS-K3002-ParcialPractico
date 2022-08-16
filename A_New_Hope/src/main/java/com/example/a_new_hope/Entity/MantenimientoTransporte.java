package com.example.a_new_hope.Entity;

public class MantenimientoTransporte extends Mantenimiento{
        private int costoEnCreditosDeLaNave;
        private int capacidadDeCargaDeLaNave;

        public MantenimientoTransporte(int costoEnCreditosDeLaNave, int capacidadDeCargaDeLaNave) {
            super(10);
            this.costoEnCreditosDeLaNave = costoEnCreditosDeLaNave;
            this.capacidadDeCargaDeLaNave = capacidadDeCargaDeLaNave;
        }

        @Override
        public int obtenerPrecio() {
            return this.getPrecioEstandar() + (costoEnCreditosDeLaNave * capacidadDeCargaDeLaNave);
        }

}
