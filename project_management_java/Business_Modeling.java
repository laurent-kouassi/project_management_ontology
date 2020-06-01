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
 * Source Class: Business_Modeling <br>
 * @version generated on Fri Dec 27 13:22:21 EET 2019 by morningstar
 */

public interface Business_Modeling extends Discipline {

    /* ***************************************************
     * Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasBreadthRole
     */
     
    /**
     * Gets all property values for the hasBreadthRole property.<p>
     * 
     * @returns a collection of values for the hasBreadthRole property.
     */
    Collection<? extends Role> getHasBreadthRole();

    /**
     * Checks if the class has a hasBreadthRole property value.<p>
     * 
     * @return true if there is a hasBreadthRole property value.
     */
    boolean hasHasBreadthRole();

    /**
     * Adds a hasBreadthRole property value.<p>
     * 
     * @param newHasBreadthRole the hasBreadthRole property value to be added
     */
    void addHasBreadthRole(Role newHasBreadthRole);

    /**
     * Removes a hasBreadthRole property value.<p>
     * 
     * @param oldHasBreadthRole the hasBreadthRole property value to be removed.
     */
    void removeHasBreadthRole(Role oldHasBreadthRole);


    /* ***************************************************
     * Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#hasDepthRole
     */
     
    /**
     * Gets all property values for the hasDepthRole property.<p>
     * 
     * @returns a collection of values for the hasDepthRole property.
     */
    Collection<? extends Role> getHasDepthRole();

    /**
     * Checks if the class has a hasDepthRole property value.<p>
     * 
     * @return true if there is a hasDepthRole property value.
     */
    boolean hasHasDepthRole();

    /**
     * Adds a hasDepthRole property value.<p>
     * 
     * @param newHasDepthRole the hasDepthRole property value to be added
     */
    void addHasDepthRole(Role newHasDepthRole);

    /**
     * Removes a hasDepthRole property value.<p>
     * 
     * @param oldHasDepthRole the hasDepthRole property value to be removed.
     */
    void removeHasDepthRole(Role oldHasDepthRole);


    /* ***************************************************
     * Property http://www.semanticweb.org/morningstar/ontologies/2019/9/untitled-ontology-9#isDomainOf
     */
     
    /**
     * Gets all property values for the isDomainOf property.<p>
     * 
     * @returns a collection of values for the isDomainOf property.
     */
    Collection<? extends Artifact> getIsDomainOf();

    /**
     * Checks if the class has a isDomainOf property value.<p>
     * 
     * @return true if there is a isDomainOf property value.
     */
    boolean hasIsDomainOf();

    /**
     * Adds a isDomainOf property value.<p>
     * 
     * @param newIsDomainOf the isDomainOf property value to be added
     */
    void addIsDomainOf(Artifact newIsDomainOf);

    /**
     * Removes a isDomainOf property value.<p>
     * 
     * @param oldIsDomainOf the isDomainOf property value to be removed.
     */
    void removeIsDomainOf(Artifact oldIsDomainOf);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
