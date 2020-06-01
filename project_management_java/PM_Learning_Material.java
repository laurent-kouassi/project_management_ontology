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
 * Source Class: PM_Learning_Material <br>
 * @version generated on Fri Dec 27 13:22:21 EET 2019 by morningstar
 */

public interface PM_Learning_Material extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasLearningMaterial
     */
     
    /**
     * Gets all property values for the hasLearningMaterial property.<p>
     * 
     * @returns a collection of values for the hasLearningMaterial property.
     */
    Collection<? extends Discipline> getHasLearningMaterial();

    /**
     * Checks if the class has a hasLearningMaterial property value.<p>
     * 
     * @return true if there is a hasLearningMaterial property value.
     */
    boolean hasHasLearningMaterial();

    /**
     * Adds a hasLearningMaterial property value.<p>
     * 
     * @param newHasLearningMaterial the hasLearningMaterial property value to be added
     */
    void addHasLearningMaterial(Discipline newHasLearningMaterial);

    /**
     * Removes a hasLearningMaterial property value.<p>
     * 
     * @param oldHasLearningMaterial the hasLearningMaterial property value to be removed.
     */
    void removeHasLearningMaterial(Discipline oldHasLearningMaterial);


    /* ***************************************************
     * Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#isRecommendedTo
     */
     
    /**
     * Gets all property values for the isRecommendedTo property.<p>
     * 
     * @returns a collection of values for the isRecommendedTo property.
     */
    Collection<? extends Artifact> getIsRecommendedTo();

    /**
     * Checks if the class has a isRecommendedTo property value.<p>
     * 
     * @return true if there is a isRecommendedTo property value.
     */
    boolean hasIsRecommendedTo();

    /**
     * Adds a isRecommendedTo property value.<p>
     * 
     * @param newIsRecommendedTo the isRecommendedTo property value to be added
     */
    void addIsRecommendedTo(Artifact newIsRecommendedTo);

    /**
     * Removes a isRecommendedTo property value.<p>
     * 
     * @param oldIsRecommendedTo the isRecommendedTo property value to be removed.
     */
    void removeIsRecommendedTo(Artifact oldIsRecommendedTo);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
