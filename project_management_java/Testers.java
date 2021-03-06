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
 * Source Class: Testers <br>
 * @version generated on Fri Dec 27 13:22:21 EET 2019 by morningstar
 */

public interface Testers extends Role {

    /* ***************************************************
     * Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasConsult
     */
     
    /**
     * Gets all property values for the hasConsult property.<p>
     * 
     * @returns a collection of values for the hasConsult property.
     */
    Collection<? extends Artifact> getHasConsult();

    /**
     * Checks if the class has a hasConsult property value.<p>
     * 
     * @return true if there is a hasConsult property value.
     */
    boolean hasHasConsult();

    /**
     * Adds a hasConsult property value.<p>
     * 
     * @param newHasConsult the hasConsult property value to be added
     */
    void addHasConsult(Artifact newHasConsult);

    /**
     * Removes a hasConsult property value.<p>
     * 
     * @param oldHasConsult the hasConsult property value to be removed.
     */
    void removeHasConsult(Artifact oldHasConsult);


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
     * Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasPerform
     */
     
    /**
     * Gets all property values for the hasPerform property.<p>
     * 
     * @returns a collection of values for the hasPerform property.
     */
    Collection<? extends Activity> getHasPerform();

    /**
     * Checks if the class has a hasPerform property value.<p>
     * 
     * @return true if there is a hasPerform property value.
     */
    boolean hasHasPerform();

    /**
     * Adds a hasPerform property value.<p>
     * 
     * @param newHasPerform the hasPerform property value to be added
     */
    void addHasPerform(Activity newHasPerform);

    /**
     * Removes a hasPerform property value.<p>
     * 
     * @param oldHasPerform the hasPerform property value to be removed.
     */
    void removeHasPerform(Activity oldHasPerform);


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
     * Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasResponsible
     */
     
    /**
     * Gets all property values for the hasResponsible property.<p>
     * 
     * @returns a collection of values for the hasResponsible property.
     */
    Collection<? extends Artifact> getHasResponsible();

    /**
     * Checks if the class has a hasResponsible property value.<p>
     * 
     * @return true if there is a hasResponsible property value.
     */
    boolean hasHasResponsible();

    /**
     * Adds a hasResponsible property value.<p>
     * 
     * @param newHasResponsible the hasResponsible property value to be added
     */
    void addHasResponsible(Artifact newHasResponsible);

    /**
     * Removes a hasResponsible property value.<p>
     * 
     * @param oldHasResponsible the hasResponsible property value to be removed.
     */
    void removeHasResponsible(Artifact oldHasResponsible);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
