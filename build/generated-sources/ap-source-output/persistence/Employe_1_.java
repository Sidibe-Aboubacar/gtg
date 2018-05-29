package persistence;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistence.employe.EmpImg;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-16T10:39:17")
@StaticMetamodel(Employe_1.class)
public class Employe_1_ { 

    public static volatile SingularAttribute<Employe_1, String> empId;
    public static volatile SingularAttribute<Employe_1, String> ville;
    public static volatile SingularAttribute<Employe_1, EmpImg> empimage;
    public static volatile SingularAttribute<Employe_1, String> sex;
    public static volatile SingularAttribute<Employe_1, String> numeroDeRue;
    public static volatile SingularAttribute<Employe_1, Integer> telephoneResidence;
    public static volatile SingularAttribute<Employe_1, String> nom;
    public static volatile SingularAttribute<Employe_1, String> etat;
    public static volatile SingularAttribute<Employe_1, String> codePostale;
    public static volatile SingularAttribute<Employe_1, Date> dateDeNaissance;
    public static volatile SingularAttribute<Employe_1, Date> dateDePayement;
    public static volatile SingularAttribute<Employe_1, String> fonction;
    public static volatile SingularAttribute<Employe_1, Integer> cellulaire;
    public static volatile SingularAttribute<Employe_1, Float> montantSalaire;
    public static volatile SingularAttribute<Employe_1, String> prenom;
    public static volatile SingularAttribute<Employe_1, String> email;
    public static volatile SingularAttribute<Employe_1, String> diplome;
    public static volatile SingularAttribute<Employe_1, String> pays;
    public static volatile SingularAttribute<Employe_1, String> status;

}