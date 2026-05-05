package tp6.ejercicio5;

public class SimuladorLaboratorio1 {
    private ListaDePCs Computadoras;
    private ColaDeEstudiantes ColaDeEspera;
    private ListaDeEstudiantes informe;
    private int PCsOcupadas;

    public SimuladorLaboratorio1(){
        this.Computadoras = new ListaDePCs();
        this.ColaDeEspera = new ColaDeEstudiantes();
        this.informe = new ListaDeEstudiantes();
        for(int i = 0;i<15;i++){
            Computadoras.insertar(new PC(i+1),Computadoras.tamanio());
        }
        this.PCsOcupadas = 0;
    }
    private boolean laboratorioLleno(){
        return this.PCsOcupadas==15;
    }
    public void simularDia(){
        int contadorAlumnos = 1;
        for(int minutoActual = 0; minutoActual < 600; minutoActual++){ // 600 minutos = 10 horas (10am a 20pm)
            System.out.println("Minuto: "+minutoActual);
            if(Math.random() < 0.015){
                String nombre = "Estudiante "+contadorAlumnos;
                Estudiante estudiante = new Estudiante(nombre,minutoActual);
                contadorAlumnos++;
                if(!laboratorioLleno()){
                    PC pc = (PC) Computadoras.devolver(PCsOcupadas);
                    pc.ocuparPc(estudiante,minutoActual);
                    PCsOcupadas++;
                }
                else{
                    ColaDeEspera.meter(estudiante);
                }
            }
            for(int i=0;i<Computadoras.tamanio();i++){
                PC pc = (PC)Computadoras.devolver(i);
                if(!pc.estaLibre()){
                    if(minutoActual==pc.getMinutoLiberacion()){
                        Estudiante e = pc.getEstudiante();
                        informe.insertar(e,informe.tamanio());
                        pc.liberarPc();
                        if(!ColaDeEspera.estaVacia()){
                            Estudiante proximo = (Estudiante) ColaDeEspera.sacar();
                            pc.ocuparPc(proximo,minutoActual);
                        }
                    }
                }
            }
        }
    }

    public void mostrarInforme(){
        System.out.println("--- REPORTE FINAL DE CONEXIONES ---");
        // Usamos tamanio() y devolver(i) que son operaciones de Nivel Usuario [5, 6]
        for (int i = 0; i < this.informe.tamanio(); i++) {
            Estudiante e = (Estudiante) this.informe.devolver(i);

            // Aquí hacés la lógica de conversión de tiempo que discutimos antes
            System.out.println(e);
        }
        System.out.println("Total de alumnos atendidos: " + this.informe.tamanio());
    }
}
