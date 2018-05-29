package persistence.instrument;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-16T10:39:17")
@StaticMetamodel(Entretien.class)
public class Entretien_ { 

    public static volatile SingularAttribute<Entretien, Date> dateEntretien;
    public static volatile SingularAttribute<Entretien, Long> fournisseurId;
    public static volatile SingularAttribute<Entretien, String> cout;
    public static volatile SingularAttribute<Entretien, String> fournisseurName;
    public static volatile SingularAttribute<Entretien, String> details;
    public static volatile SingularAttribute<Entretien, String> numeroDeSerie;
    public static volatile SingularAttribute<Entretien, Long> id;

}