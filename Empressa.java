    import java.util.ArrayList;
    import java.util.List;

    public class Empressa {
        public List<Camion> camiones;

        public Empressa(){
            this.camiones = new ArrayList<>();
            //Los camiones son
            camiones.add(new Camion("AAA000", 1000, 8));
            camiones.add(new Camion("BBB111", 1500, 6));
            camiones.add(new Camion("CCC222", 800, 10));
            camiones.add(new Camion("DDD333", 1200, 7));

        }

        //Metodo para elegir camion
        public Camion elegirCamion(double peso){
            Camion mejorCamion = null;
            for(int i = 0; i < camiones.size(); i++){
                Camion camion = camiones.get(i);
                if (camion.capacidad - camion.cargaActual >= peso) {
                    if (mejorCamion == null || camion.consumo < mejorCamion.consumo) {
                        mejorCamion = camion;
                    }
                }
            }
            return mejorCamion;
        }

        // Metodo para listar los camiones
        public List<String> listaCam() {
            List<String> listarCamiones = new ArrayList<>();
            for(int i = 0; i<camiones.size();i++){
                listarCamiones.add(camiones.get(i).toString());
            }
            return listarCamiones;
        }



    }
