package tp6.ejercicio8;

public class TestSubsidios {
    public static void main(){
        Subsidio listaPendiente = new Subsidio();
        listaPendiente.meter(new Persona(84848,'G',"Rumbas"));
        listaPendiente.meter(new Persona(1123,'M',"Enzo"));
        listaPendiente.meter(new Persona(46464646,'F',"NosoyIsaShhhhh"));
        listaPendiente.meter(new Persona(2323,'M',"Ivan"));

        Subsidio s1 = new Subsidio();
        Subsidio s2 = new Subsidio();
        Subsidio s1unions2;
        Subsidio s3 = new Subsidio();

        s1.meter(new Persona(46668417,'M',"Awus"));
        s1.meter(new Persona(46464646,'F',"Isa"));
        s1.meter(new Persona(47474747,'M',"Rich"));

        s2.meter(new Persona(12345678,'M',"Lean"));

        s1unions2 = (Subsidio) s1.union(s2);

        for(int i = 0; i<listaPendiente.tamanio(); i++){
            if(s1unions2.esta( listaPendiente.devolver(i) )){
                System.out.println(listaPendiente.devolver(i)+" YA TENES SUBSIDIOOOO ISABELLAAAAA AAAAAAAA");
            }
            else{
                s3.esta( listaPendiente.devolver(i) );
            }
        }
    }
}
