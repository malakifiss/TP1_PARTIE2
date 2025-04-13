package presen;


import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PresentationSpringAnnotation {

    public static void main(String[] args) {

        //scanner tous les package qui se trouve dans ext , metier et dao
        ApplicationContext context = new AnnotationConfigApplicationContext("ext","metier","dao");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());
    }
}
