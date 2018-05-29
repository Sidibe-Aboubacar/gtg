package persistence.instrument;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-16T10:39:17")
@StaticMetamodel(Instrument.class)
public class Instrument_ { 

    public static volatile SingularAttribute<Instrument, Date> dateDacquisition;
    public static volatile SingularAttribute<Instrument, String> numero;
    public static volatile SingularAttribute<Instrument, String> disponibilite;
    public static volatile SingularAttribute<Instrument, String> couleur;
    public static volatile SingularAttribute<Instrument, String> fournisseurName;
    public static volatile SingularAttribute<Instrument, String> numeroDeSerie;
    public static volatile SingularAttribute<Instrument, String> actif;
    public static volatile SingularAttribute<Instrument, String> type;
    public static volatile SingularAttribute<Instrument, String> abbreviation;
    public static volatile SingularAttribute<Instrument, String> nom;
    public static volatile SingularAttribute<Instrument, String> version;
    public static volatile SingularAttribute<Instrument, String> marque;
    public static volatile SingularAttribute<Instrument, String> finGarantieStr;
    public static volatile SingularAttribute<Instrument, String> compatibilite;
    public static volatile SingularAttribute<Instrument, Long> fournisseurId;
    public static volatile SingularAttribute<Instrument, String> dateDacquisitionStr;
    public static volatile SingularAttribute<Instrument, String> model;
    public static volatile SingularAttribute<Instrument, String> coutDacquisition;
    public static volatile SingularAttribute<Instrument, Date> finGarantie;

}