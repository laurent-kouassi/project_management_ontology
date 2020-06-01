package pm;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Artifact_Business_Modeling <br>
 * @version generated on Fri Dec 27 13:22:21 EET 2019 by morningstar
 */

public interface Artifact_Business_Modeling extends Artifact {

    /* ***************************************************
     * Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasDomain
     */
     
    /**
     * Gets all property values for the hasDomain property.<p>
     * 
     * @returns a collection of values for the hasDomain property.
     */
    Collection<? extends Discipline> getHasDomain();

    /**
     * Checks if the class has a hasDomain property value.<p>
     * 
     * @return true if there is a hasDomain property value.
     */
    boolean hasHasDomain();

    /**
     * Adds a hasDomain property value.<p>
     * 
     * @param newHasDomain the hasDomain property value to be added
     */
    void addHasDomain(Discipline newHasDomain);

    /**
     * Removes a hasDomain property value.<p>
     * 
     * @param oldHasDomain the hasDomain property value to be removed.
     */
    void removeHasDomain(Discipline oldHasDomain);


    /* ***************************************************
     * Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasRecommendation
     */
     
    /**
     * Gets all property values for the hasRecommendation property.<p>
     * 
     * @returns a collection of values for the hasRecommendation property.
     */
    Collection<? extends PM_Learning_Material> getHasRecommendation();

    /**
     * Checks if the class has a hasRecommendation property value.<p>
     * 
     * @return true if there is a hasRecommendation property value.
     */
    boolean hasHasRecommendation();

    /**
     * Adds a hasRecommendation property value.<p>
     * 
     * @param newHasRecommendation the hasRecommendation property value to be added
     */
    void addHasRecommendation(PM_Learning_Material newHasRecommendation);

    /**
     * Removes a hasRecommendation property value.<p>
     * 
     * @param oldHasRecommendation the hasRecommendation property value to be removed.
     */
    void removeHasRecommendation(PM_Learning_Material oldHasRecommendation);


    /* ***************************************************
     * Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#isConsultedBy
     */
     
    /**
     * Gets all property values for the isConsultedBy property.<p>
     * 
     * @returns a collection of values for the isConsultedBy property.
     */
    Collection<? extends Role> getIsConsultedBy();

    /**
     * Checks if the class has a isConsultedBy property value.<p>
     * 
     * @return true if there is a isConsultedBy property value.
     */
    boolean hasIsConsultedBy();

    /**
     * Adds a isConsultedBy property value.<p>
     * 
     * @param newIsConsultedBy the isConsultedBy property value to be added
     */
    void addIsConsultedBy(Role newIsConsultedBy);

    /**
     * Removes a isConsultedBy property value.<p>
     * 
     * @param oldIsConsultedBy the isConsultedBy property value to be removed.
     */
    void removeIsConsultedBy(Role oldIsConsultedBy);


    /* ***************************************************
     * Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#isResponsibleFor
     */
     
    /**
     * Gets all property values for the isResponsibleFor property.<p>
     * 
     * @returns a collection of values for the isResponsibleFor property.
     */
    Collection<? extends Role> getIsResponsibleFor();

    /**
     * Checks if the class has a isResponsibleFor property value.<p>
     * 
     * @return true if there is a isResponsibleFor property value.
     */
    boolean hasIsResponsibleFor();

    /**
     * Adds a isResponsibleFor property value.<p>
     * 
     * @param newIsResponsibleFor the isResponsibleFor property value to be added
     */
    void addIsResponsibleFor(Role newIsResponsibleFor);

    /**
     * Removes a isResponsibleFor property value.<p>
     * 
     * @param oldIsResponsibleFor the isResponsibleFor property value to be removed.
     */
    void removeIsResponsibleFor(Role oldIsResponsibleFor);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
